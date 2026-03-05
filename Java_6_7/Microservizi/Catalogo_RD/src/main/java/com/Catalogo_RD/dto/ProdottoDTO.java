package com.Catalogo_RD.dto;

public record ProdottoDTO(
        int id,
        String nome,
        String descrizione,
        double prezzo,
        Integer version
) {
}