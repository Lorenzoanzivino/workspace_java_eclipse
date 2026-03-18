package org.example.catalogo_wr_stream.service;

import org.example.catalogo_wr_stream.dto.ProdottoDTO;
import org.example.catalogo_wr_stream.entity.Prodotto;
import org.example.catalogo_wr_stream.exception.IdNonTrovatoException;
import org.example.catalogo_wr_stream.exception.IdTrovatoException;
import org.example.catalogo_wr_stream.repository.ProdottoRepository;
import org.example.catalogo_wr_stream.utility.ProdottoUtilityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProdottoServiceImpl implements ProdottoService {

    private final ProdottoRepository repository;
    private final StreamBridge streamBridge;

    @Autowired
    public ProdottoServiceImpl(ProdottoRepository repository, StreamBridge streamBridge) {
        this.repository = repository;
        this.streamBridge = streamBridge;
    }

    @Override
    public ProdottoDTO create(ProdottoDTO dto) {
        if (dto.id() > 0 && repository.existsById(dto.id())) {
            throw new IdTrovatoException("ID già esistente: " + dto.id());
        }
        Prodotto prodotto = ProdottoUtilityConverter.toEntity(dto);
        prodotto.setId(0);
        ProdottoDTO creato = ProdottoUtilityConverter.toDTO(repository.save(prodotto));

        // Invio messaggio su Kafka
        streamBridge.send("myProducer-out-0", creato);

        return creato;
    }

    @Override
    public ProdottoDTO update(int id, ProdottoDTO dto) {
        Prodotto esistente = repository.findById(id)
                .orElseThrow(() -> new IdNonTrovatoException("ID non trovato: " + id));

        if (dto.version() != null && !dto.version().equals(esistente.getVersion())) {
            throw new IdTrovatoException("Conflitto di versione");
        }

        Prodotto daAggiornare = ProdottoUtilityConverter.toEntity(dto);
        daAggiornare.setId(id);
        ProdottoDTO aggiornato = ProdottoUtilityConverter.toDTO(repository.save(daAggiornare));

        // Invio messaggio su Kafka
        streamBridge.send("myProducer-out-0", aggiornato);

        return aggiornato;
    }

    @Override
    public void delete(int id) {
        if (!repository.existsById(id)) {
            throw new IdNonTrovatoException("ID non trovato: " + id);
        }
        repository.deleteById(id);
    }

    @Override
    public List<ProdottoDTO> findAll() {
        return ProdottoUtilityConverter.toDTOList(repository.findAll());
    }

    @Override
    public ProdottoDTO findById(int id) {
        return repository.findById(id)
                .map(ProdottoUtilityConverter::toDTO)
                .orElseThrow(() -> new IdNonTrovatoException("ID non trovato: " + id));
    }
}