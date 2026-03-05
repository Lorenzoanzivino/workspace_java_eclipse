package com.Catalogo_WR.service;

import com.Catalogo_WR.dto.ProdottoDTO;

public interface ProdottoService {

    /**
     * Crea un nuovo prodotto nel database Master.
     */
    ProdottoDTO create(ProdottoDTO prodottoDTO);

    /**
     * Aggiorna un prodotto esistente.
     * Il controllo della versione (@Version) verrà gestito dall'implementazione.
     */
    ProdottoDTO update(int id, ProdottoDTO prodottoDTO);

    /**
     * Elimina un prodotto tramite ID.
     */
    void delete(int id);
}