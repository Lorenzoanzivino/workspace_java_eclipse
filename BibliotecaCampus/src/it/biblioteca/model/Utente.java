package it.biblioteca.model;

public abstract class Utente {
	private String nome;
	private String cognome;
	private String tessera;

	public Utente(String nome, String cognome, String tessera) {
		this.setNome(nome);
		this.setCognome(cognome);
		this.setTessera(tessera);
	}

	public String getTessera() {
		return tessera;
	}

	public void setTessera(String tessera) {
		this.tessera = tessera;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
