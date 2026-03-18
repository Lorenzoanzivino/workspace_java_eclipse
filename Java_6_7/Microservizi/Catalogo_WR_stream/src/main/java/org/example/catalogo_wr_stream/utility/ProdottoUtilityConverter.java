package org.example.catalogo_wr_stream.utility;

import org.example.catalogo_wr_stream.dto.ProdottoDTO;
import org.example.catalogo_wr_stream.entity.Prodotto;

import java.util.List;
import java.util.stream.Collectors;

public class ProdottoUtilityConverter {

    private ProdottoUtilityConverter() {}

    public static ProdottoDTO toDTO(Prodotto prodotto) {
        if (prodotto == null) return null;
        return new ProdottoDTO(
                prodotto.getId(),
                prodotto.getNome(),
                prodotto.getDescrizione(),
                prodotto.getPrezzo(),
                prodotto.getVersion()
        );
    }

    public static Prodotto toEntity(ProdottoDTO dto) {
        if (dto == null) return null;
        Prodotto prodotto = new Prodotto(dto.nome(), dto.descrizione(), dto.prezzo());
        prodotto.setId(dto.id());
        prodotto.setVersion(dto.version());
        return prodotto;
    }

    public static List<ProdottoDTO> toDTOList(List<Prodotto> list) {
        return list.stream().map(ProdottoUtilityConverter::toDTO).collect(Collectors.toList());
    }
}