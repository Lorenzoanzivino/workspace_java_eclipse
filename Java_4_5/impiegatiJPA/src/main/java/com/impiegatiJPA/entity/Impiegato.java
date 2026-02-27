package com.impiegatiJPA.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Impiegato {
		@Id
		private int matricola;
		private String nome, cognome;
		private double salarioMensile;
		private LocalDate dataAssunzione;
		
		public Impiegato() {}

		public Impiegato(int matricola, String nome, String cognome, double salarioMensile, LocalDate dataAssunzione) {
			super();
			this.matricola = matricola;
			this.nome = nome;
			this.cognome = cognome;
			this.salarioMensile = salarioMensile;
			this.dataAssunzione = dataAssunzione;
		}

		public int getMatricola() {
			return matricola;
		}

		public void setMatricola(int matricola) {
			this.matricola = matricola;
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

		public double getSalarioMensile() {
			return salarioMensile;
		}

		public void setSalarioMensile(double salarioMensile) {
			this.salarioMensile = salarioMensile;
		}

		public LocalDate getDataAssunzione() {
			return dataAssunzione;
		}

		public void setDataAssunzione(LocalDate dataAssunzione) {
			this.dataAssunzione = dataAssunzione;
		}
		
		
}
