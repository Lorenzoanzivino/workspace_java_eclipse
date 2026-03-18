package com.Catalogo_WR.service;

import com.Catalogo_WR.dto.ProdottoDTO;
import com.Catalogo_WR.entity.Prodotto;
import com.Catalogo_WR.exception.IdNonTrovatoException;
import com.Catalogo_WR.exception.IdTrovatoException;
import com.Catalogo_WR.repository.ProdottoRepository;
import com.Catalogo_WR.utility.ProdottoUtilityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProdottoServiceImpl implements ProdottoService {

    private final ProdottoRepository prodottoRepository;

    @Autowired
    public ProdottoServiceImpl(ProdottoRepository prodottoRepository) {
        this.prodottoRepository = prodottoRepository;
    }

    @Override
    public ProdottoDTO create(ProdottoDTO prodottoDTO) {
        if (prodottoDTO.id() > 0 && prodottoRepository.existsById(prodottoDTO.id())) {
            throw new IdTrovatoException("Impossibile creare: ID " + prodottoDTO.id() + " già esistente.");
        }
        Prodotto prodotto = ProdottoUtilityConverter.toEntity(prodottoDTO);
        prodotto.setId(0);
        return ProdottoUtilityConverter.toDTO(prodottoRepository.save(prodotto));
    }

    @Override
    public ProdottoDTO update(int id, ProdottoDTO prodottoDTO) {
        Prodotto esistente = prodottoRepository.findById(id)
                .orElseThrow(() -> new IdNonTrovatoException("Aggiornamento fallito: ID " + id + " non trovato sul Master."));

        if (prodottoDTO.version() != null && !prodottoDTO.version().equals(esistente.getVersion())) {
            throw new IdTrovatoException("Conflitto di versione: i dati sono stati modificati da un altro utente.");
        }

        Prodotto prodottoDaAggiornare = ProdottoUtilityConverter.toEntity(prodottoDTO);
        prodottoDaAggiornare.setId(id);
        return ProdottoUtilityConverter.toDTO(prodottoRepository.save(prodottoDaAggiornare));
    }

    @Override
    public void delete(int id) {
        if (!prodottoRepository.existsById(id)) {
            throw new IdNonTrovatoException("Eliminazione fallita: ID " + id + " non trovato.");
        }
        prodottoRepository.deleteById(id);
    }

    // --- METODI DI RICERCA RINOMINATI PER MATCHARE L'INTERFACCIA ---

    @Override
    public List<ProdottoDTO> findAll() {
        List<Prodotto> prodotti = prodottoRepository.findAll();
        return ProdottoUtilityConverter.toDTOList(prodotti);
    }

    @Override
    public ProdottoDTO findById(int id) {
        return prodottoRepository.findById(id)
                .map(ProdottoUtilityConverter::toDTO)
                .orElseThrow(() -> new IdNonTrovatoException("Prodotto con ID " + id + " non trovato sul Master."));
    }

    @Override
    public int cercaVersione(int id) {
        return prodottoRepository.findById(id)
                .map(Prodotto::getVersion)
                .orElseThrow(() -> new IdNonTrovatoException("Impossibile recuperare versione per ID " + id));
    }

    @Override
    public ProdottoDTO cerca(int id) {
        return prodottoRepository.findById(id)
                .map(ProdottoUtilityConverter::toDTO)
                .orElseThrow(() -> new IdNonTrovatoException("Ricerca fallita: Prodotto " + id + " non presente sul Master."));
    }

    @Override
    public List<ProdottoDTO> cercaTutti() {
        List<Prodotto> prodotti = prodottoRepository.findAll();
        return ProdottoUtilityConverter.toDTOList(prodotti);
    }
}