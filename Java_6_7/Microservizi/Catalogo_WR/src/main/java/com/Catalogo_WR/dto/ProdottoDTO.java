package com.Catalogo_WR.dto;

public record ProdottoDTO(
        int id,
        String nome,
        String descrizione,
        double prezzo,
        Integer version
) {
}