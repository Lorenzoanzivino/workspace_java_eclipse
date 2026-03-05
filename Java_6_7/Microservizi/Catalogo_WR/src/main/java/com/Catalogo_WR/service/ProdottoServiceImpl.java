package com.Catalogo_WR.service;

import com.Catalogo_WR.dto.ProdottoDTO;
import com.Catalogo_WR.entity.Prodotto;
import com.Catalogo_WR.repository.ProdottoRepository;
import com.Catalogo_WR.utility.ProdottoUtilityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional // Fondamentale per il lato Write
public class ProdottoServiceImpl implements ProdottoService {

    private final ProdottoRepository prodottoRepository;

    @Autowired
    public ProdottoServiceImpl(ProdottoRepository prodottoRepository) {
        this.prodottoRepository = prodottoRepository;
    }

    @Override
    public ProdottoDTO create(ProdottoDTO prodottoDTO) {
        // Convertiamo il DTO in Entity
        Prodotto prodotto = ProdottoUtilityConverter.toEntity(prodottoDTO);

        // Per sicurezza, resettiamo l'ID a 0 per forzare la creazione di un nuovo record
        prodotto.setId(0);

        // Salviamo sul Master
        Prodotto salvato = prodottoRepository.save(prodotto);

        // Ritorniamo il DTO con l'ID appena generato
        return ProdottoUtilityConverter.toDTO(salvato);
    }

    @Override
    public ProdottoDTO update(int id, ProdottoDTO prodottoDTO) {
        // Verifichiamo se il prodotto esiste prima di procedere
        if (!prodottoRepository.existsById(id)) {
            throw new RuntimeException("Impossibile aggiornare: Prodotto con ID " + id + " non trovato.");
        }

        // Convertiamo il DTO in Entity (che contiene già la 'version' per il lock ottimistico)
        Prodotto prodottoDaAggiornare = ProdottoUtilityConverter.toEntity(prodottoDTO);

        // Ci assicuriamo che l'ID sia quello corretto passato nell'URL
        prodottoDaAggiornare.setId(id);

        // Il metodo save gestirà il Lock Ottimistico tramite il campo @Version
        // Se la versione nel DB è diversa da quella nel DTO, scatta l'eccezione
        Prodotto aggiornato = prodottoRepository.save(prodottoDaAggiornare);

        return ProdottoUtilityConverter.toDTO(aggiornato);
    }

    @Override
    public void delete(int id) {
        if (!prodottoRepository.existsById(id)) {
            throw new RuntimeException("Impossibile eliminare: Prodotto con ID " + id + " non trovato.");
        }
        prodottoRepository.deleteById(id);
    }
}