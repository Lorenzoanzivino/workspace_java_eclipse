package com.Catalogo_RD.service;

import com.Catalogo_RD.dto.ProdottoDTO;
import java.util.List;

public interface ProdottoService {

    List<ProdottoDTO> findAll();

    ProdottoDTO findById(int id);

}