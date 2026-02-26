package com.EcommerceJPA.mapper;

import com.EcommerceJPA.dto.VenditoreDTO;
import com.EcommerceJPA.entity.Venditore;

public class MapperVenditoreProdotto {

    // Entity -> DTO
    public static VenditoreDTO toDTO(Venditore v) {
        if (v == null) return null;

        VenditoreDTO dto = new VenditoreDTO();
        dto.setId(v.getId());
        dto.setNome(v.getNome());
        dto.setCognome(v.getCognome());
        dto.setUsername(v.getUsername());
        dto.setPassword(v.getPassword());
        dto.setVia(v.getVia());
        dto.setCitta(v.getCitta());
        return dto;
    }

    // DTO -> Entity
    public static Venditore toEntity(VenditoreDTO dto) {
        if (dto == null) return null;

        Venditore v = new Venditore();
        v.setId(dto.getId());
        v.setNome(dto.getNome());
        v.setCognome(dto.getCognome());
        v.setUsername(dto.getUsername());
        v.setPassword(dto.getPassword());
        v.setVia(dto.getVia());
        v.setCitta(dto.getCitta());
        return v;
    }
}
