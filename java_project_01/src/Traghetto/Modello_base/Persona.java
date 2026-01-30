package Traghetto.Modello_base;

import Traghetto.Interfaccia.Tariffabile;

public class Persona implements Tariffabile {

	private String nome;
	private String cognome;

	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	@Override
	public double calcolaTariffa() {
		return 2.5; // tariffa fissa per persona a piedi
	}

	@Override
	public String toString() {
		return nome + " " + cognome;
	}
}
