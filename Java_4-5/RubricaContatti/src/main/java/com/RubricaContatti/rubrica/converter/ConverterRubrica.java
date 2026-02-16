package com.RubricaContatti.rubrica.converter;

import java.util.ArrayList;
import java.util.List;

import com.rubricaTelefonica.dto.RubricaDTO;
import com.rubricaTelefonica.entity.Rubrica;

public class ConverterRubrica {
	
	public static Rubrica rubricaDTOtoEntity(RubricaDTO rdto) {
		Rubrica rubrica = new Rubrica();
		rubrica.setId(rdto.getId());
		rubrica.setNomeProprietario(rdto.getNomeProprietario());
		rubrica.setDataCreazione(rdto.getDataCreazione());
		return rubrica;
	}
	public static RubricaDTO rubricaEntitytoDTO(Rubrica r) {
		RubricaDTO rdto = new RubricaDTO();
		rdto.setId(r.getId());
		rdto.setNomeProprietario(r.getNomeProprietario());
		rdto.setDataCreazione(r.getDataCreazione());
		return rdto;
	}

	public static List<Rubrica> listaRubricaDTOtoEntity(List<RubricaDTO> r){
		List<Rubrica> rubriche = new ArrayList<>();
		r.forEach(rubrica -> rubriche.add(rubricaDTOtoEntity(rubrica)));
		return rubriche;
	}
	
	public static List<RubricaDTO> listaRubricaEntityToDTO(List<Rubrica> r){
		List<RubricaDTO> rubricheDTO = new ArrayList<>();
		r.forEach(rubricaDTO -> rubricheDTO.add(rubricaEntitytoDTO(rubricaDTO)));
		return rubricheDTO;
	}

}
