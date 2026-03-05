package com.Catalogo_RD.service;

import com.Catalogo_RD.dto.ProdottoDTO;
import com.Catalogo_RD.entity.Prodotto;
import com.Catalogo_RD.repository.ProdottoRepository;
import com.Catalogo_RD.utility.ProdottoUtilityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdottoServiceImpl implements ProdottoService {

    private final ProdottoRepository prodottoRepository;

    @Autowired
    public ProdottoServiceImpl(ProdottoRepository prodottoRepository) {
        this.prodottoRepository = prodottoRepository;
    }

    @Override
    public List<ProdottoDTO> findAll() {
        List<Prodotto> prodotti = prodottoRepository.findAll();
        // Usiamo la utility appena creata per trasformare la lista di Entity in lista di DTO
        return ProdottoUtilityConverter.toDTOList(prodotti);
    }

    @Override
    public ProdottoDTO findById(int id) {
        Prodotto prodotto = prodottoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Prodotto con ID " + id + " non trovato."));

        // Trasformiamo la singola Entity trovata nel DTO richiesto
        return ProdottoUtilityConverter.toDTO(prodotto);
    }
}