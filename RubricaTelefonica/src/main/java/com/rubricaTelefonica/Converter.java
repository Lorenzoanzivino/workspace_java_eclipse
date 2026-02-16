package com.rubricaTelefonica;

import java.util.ArrayList;
import java.util.List;

import com.rubricaTelefonica.dto.ContattoDTO;
import com.rubricaTelefonica.dto.RubricaDTO;
import com.rubricaTelefonica.entity.Contatto;
import com.rubricaTelefonica.entity.Rubrica;

public class Converter {
	
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

	public static Contatto contattoDTOtoEntit(ContattoDTO cdto) {
		Contatto contatto = new Contatto();
		contatto.setId(cdto.getId());
		contatto.setNome(cdto.getNome());
		contatto.setCognome(cdto.getCognome());
		contatto.setTelefono(cdto.getTelefono());
		contatto.setGruppoAppartenenza(cdto.getGruppoAppartenenza());
		contatto.setDataNascita(cdto.getDataNascita());
		contatto.setPreferito(cdto.getPreferito());
		return contatto;
	}
	
	public static ContattoDTO contattoEntitytoDTO(Contatto c) {
		ContattoDTO cdto = new ContattoDTO();
		cdto.setId(c.getId());
		cdto.setNome(c.getNome());
		cdto.setCognome(c.getCognome());
		cdto.setTelefono(c.getTelefono());
		cdto.setGruppoAppartenenza(c.getGruppoAppartenenza());
		cdto.setDataNascita(c.getDataNascita());
		cdto.setPreferito(c.getPreferito());
		return cdto;
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
