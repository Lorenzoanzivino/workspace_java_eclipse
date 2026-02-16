package com.rubricaTelefonica.dto;

import java.time.LocalDate;

public class ContattoDTO {
	private String id, nome, cognome, telefono, gruppoAppartenenza;
	private LocalDate dataNascita;
	private boolean preferito;
	
	public ContattoDTO() {};
	
	public ContattoDTO(String id, String nome, String cognome, String telefono, String gruppoAppartenenza,
			LocalDate dataNascita, boolean preferito) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
		this.gruppoAppartenenza = gruppoAppartenenza;
		this.dataNascita = dataNascita;
		this.preferito = preferito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getGruppoAppartenenza() {
		return gruppoAppartenenza;
	}

	public void setGruppoAppartenenza(String gruppoAppartenenza) {
		this.gruppoAppartenenza = gruppoAppartenenza;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public boolean getPreferito() {
		return preferito;
	}

	public void setPreferito(boolean preferito) {
		this.preferito = preferito;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	

}
