package com.Catalogo_WR.utility;

import com.Catalogo_WR.dto.ProdottoDTO;
import com.Catalogo_WR.entity.Prodotto;

import java.util.List;
import java.util.stream.Collectors;

public class ProdottoUtilityConverter {

    private ProdottoUtilityConverter() {
        // Costruttore privato per evitare l'istanziazione di classi utility
    }

    public static ProdottoDTO toDTO(Prodotto prodotto) {
        if (prodotto == null) {
            return null;
        }
        return new ProdottoDTO(
                prodotto.getId(),
                prodotto.getNome(),
                prodotto.getDescrizione(),
                prodotto.getPrezzo(),
                prodotto.getVersion()
        );
    }

    public static Prodotto toEntity(ProdottoDTO prodottoDTO) {
        if (prodottoDTO == null) {
            return null;
        }
        // Il costruttore dell'Entity viene usato per i campi obbligatori
        Prodotto prodotto = new Prodotto(
                prodottoDTO.nome(),
                prodottoDTO.descrizione(),
                prodottoDTO.prezzo()
        );
        // L'id e la versione vengono settati separatamente per le operazioni di aggiornamento
        prodotto.setId(prodottoDTO.id());
        prodotto.setVersion(prodottoDTO.version());
        return prodotto;
    }

    public static List<ProdottoDTO> toDTOList(List<Prodotto> prodotti) {
        if (prodotti == null) {
            return null;
        }
        return prodotti.stream()
                .map(ProdottoUtilityConverter::toDTO)
                .collect(Collectors.toList());
    }

    public static List<Prodotto> toEntityList(List<ProdottoDTO> prodottiDTO) {
        if (prodottiDTO == null) {
            return null;
        }
        return prodottiDTO.stream()
                .map(ProdottoUtilityConverter::toEntity)
                .collect(Collectors.toList());
    }
}