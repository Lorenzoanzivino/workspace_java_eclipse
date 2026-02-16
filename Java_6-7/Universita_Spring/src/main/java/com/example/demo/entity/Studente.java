package com.example.demo.entity;

import java.time.LocalDate;
import java.time.Year;

public class Studente {
	private final String matricola; 
	private String nome, cognome, indirizzo;
	private LocalDate annoNascita;
	private Year annoImmatricolazione;
	
	public Studente(String matricola, String nome, String cognome, String indirizzo, LocalDate annoNascita, Year annoImmatricolazione) {
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.setIndirizzo(indirizzo);
		this.annoNascita = annoNascita;
		this.annoImmatricolazione = annoImmatricolazione;
	}

	public String getMatricola() {
		return matricola;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}
	
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public LocalDate getAnnoNascita() {
		return annoNascita;
	}

	public Year getAnnoImmatricolazione() {
		return annoImmatricolazione;
	}
}
