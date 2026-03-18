package com.Catalogo_WR.service;

import com.Catalogo_WR.dto.ProdottoDTO;

import java.util.ArrayList;
import java.util.List;

public interface ProdottoService {
    ProdottoDTO create(ProdottoDTO prodottoDTO);
    ProdottoDTO update(int id, ProdottoDTO prodottoDTO);
    void delete(int id);
    List<ProdottoDTO> findAll();      // Deve chiamarsi così
    ProdottoDTO findById(int id);     // Deve chiamarsi così
    int cercaVersione(int id);
    ProdottoDTO cerca(int id);
    List<ProdottoDTO> cercaTutti();
}