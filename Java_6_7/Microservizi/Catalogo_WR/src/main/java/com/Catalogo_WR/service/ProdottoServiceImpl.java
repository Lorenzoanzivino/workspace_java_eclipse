package com.Catalogo_WR.service;

import com.Catalogo_WR.dto.ProdottoDTO;
import com.Catalogo_WR.entity.Prodotto;
import com.Catalogo_WR.exception.IdNonTrovatoException;
import com.Catalogo_WR.exception.IdTrovatoException;
import com.Catalogo_WR.repository.ProdottoRepository;
import com.Catalogo_WR.utility.ProdottoUtilityConverter;
import com.Catalogo_WR.service.client.ProdottoRdClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProdottoServiceImpl implements ProdottoService {

    private final ProdottoRepository prodottoRepository;
    private final ProdottoRdClient prodottoRdClient;

    @Autowired
    public ProdottoServiceImpl(ProdottoRepository prodottoRepository, ProdottoRdClient prodottoRdClient) {
        this.prodottoRepository = prodottoRepository;
        this.prodottoRdClient = prodottoRdClient;
    }

    @Override
    public ProdottoDTO create(ProdottoDTO prodottoDTO) {
        // Verifica se l'ID è già presente per evitare duplicati accidentali
        if (prodottoDTO.id() > 0 && prodottoRepository.existsById(prodottoDTO.id())) {
            throw new IdTrovatoException("Impossibile creare: Prodotto con ID " + prodottoDTO.id() + " già esistente.");
        }

        Prodotto prodotto = ProdottoUtilityConverter.toEntity(prodottoDTO);
        prodotto.setId(0);
        Prodotto salvato = prodottoRepository.save(prodotto);
        return ProdottoUtilityConverter.toDTO(salvato);
    }

    @Override
    public ProdottoDTO cerca(int id) {
        return prodottoRepository.findById(id)
                .map(ProdottoUtilityConverter::toDTO)
                .orElseThrow(() -> new IdNonTrovatoException("Prodotto con ID " + id + " non trovato."));
    }

    @Override
    public int cercaVersione(int id) {
        return prodottoRepository.findById(id)
                .map(Prodotto::getVersion)
                .orElseThrow(() -> new IdNonTrovatoException("ID " + id + " non trovato per recupero versione."));
    }

    @Override
    public List<ProdottoDTO> cercaTutti() {
        return ProdottoUtilityConverter.toDTOList(prodottoRepository.findAll());
    }

    @Override
    public ProdottoDTO update(int id, ProdottoDTO prodottoDTO) {
        // 1. VERIFICA ESTERNA: Chiediamo al modulo RD lo stato attuale per validare la versione
        try {
            ProdottoDTO statoAttualeRD = prodottoRdClient.getProdottoById(id);

            if (prodottoDTO.version() != null && !prodottoDTO.version().equals(statoAttualeRD.version())) {
                throw new IdTrovatoException("Conflitto di versione rilevato dal modulo di lettura.");
            }
        } catch (Exception e) {
            // Se il client fallisce (es. 404), lanciamo l'eccezione specifica
            throw new IdNonTrovatoException("Il prodotto con ID " + id + " non è presente o sincronizzato nel modulo RD.");
        }

        // 2. VERIFICA LOCALE: Controllo sul database Master
        if (!prodottoRepository.existsById(id)) {
            throw new IdNonTrovatoException("Aggiornamento fallito: ID " + id + " non trovato sul database Master.");
        }

        Prodotto prodottoDaAggiornare = ProdottoUtilityConverter.toEntity(prodottoDTO);
        prodottoDaAggiornare.setId(id);

        Prodotto aggiornato = prodottoRepository.save(prodottoDaAggiornare);
        return ProdottoUtilityConverter.toDTO(aggiornato);
    }

    @Override
    public void delete(int id) {
        if (!prodottoRepository.existsById(id)) {
            throw new IdNonTrovatoException("Eliminazione fallita: Prodotto con ID " + id + " non trovato.");
        }
        prodottoRepository.deleteById(id);
    }
}