package com.Catalogo_WR.service;

import com.Catalogo_WR.dto.ProdottoDTO;

import java.util.List;

public interface ProdottoService {

    ProdottoDTO create(ProdottoDTO prodottoDTO);

    ProdottoDTO cerca(int id);

    int cercaVersione(int id);

    List<ProdottoDTO> cercaTutti();

    ProdottoDTO update(int id, ProdottoDTO prodottoDTO);

    void delete(int id);
}