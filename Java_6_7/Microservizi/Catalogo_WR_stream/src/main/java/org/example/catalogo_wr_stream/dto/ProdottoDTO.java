package org.example.catalogo_wr_stream.dto;

public record ProdottoDTO(
        int id,
        String nome,
        String descrizione,
        double prezzo,
        Integer version
) {}