package com.rubricaTelefonica.entity;

import java.time.LocalDate;

public class Rubrica {
	private String id, nomeProprietario;
	private LocalDate dataCreazione;
	
	public Rubrica() {}
	
	public Rubrica(String id, String nomeProprietario, LocalDate dataCreazione) {
		super();
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
