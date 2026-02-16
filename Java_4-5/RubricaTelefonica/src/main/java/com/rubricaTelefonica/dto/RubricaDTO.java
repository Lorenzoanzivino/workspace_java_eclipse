package com.rubricaTelefonica.dto;

import java.time.LocalDate;

public class RubricaDTO {
	private String id, nomeProprietario;
	private LocalDate dataCreazione;
	
	public RubricaDTO() {}
	
	public RubricaDTO(String id, String nomeProprietario, LocalDate dataCreazione) {
		this.id = id;
		this.nomeProprietario = nomeProprietario;
		this.dataCreazione = dataCreazione;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	public LocalDate getDataCreazione() {
		return dataCreazione;
	}
	public void setDataCreazione(LocalDate dataCreazione) {
		this.dataCreazione = dataCreazione;
	}
	
	
}
