package org.example.catalogo_wr_stream.service;

import org.example.catalogo_wr_stream.dto.ProdottoDTO;

import java.util.List;

public interface ProdottoService {
    ProdottoDTO create(ProdottoDTO dto);
    ProdottoDTO update(int id, ProdottoDTO dto);
    void delete(int id);
    List<ProdottoDTO> findAll();
    ProdottoDTO findById(int id);
}