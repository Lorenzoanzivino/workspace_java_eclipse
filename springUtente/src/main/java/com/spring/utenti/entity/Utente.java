package com.spring.utenti.entity;

public class Utente {
	private String nome, cognome, mail, telefono;
	private int idUtente;
	
	public Utente(String nome, String cognome, String mail, String telefono, int idUtente) {
		super();
		this.setNome(nome);
		this.setCognome(cognome);
		this.setMail(mail);
		this.setTelefono(telefono);
		this.setIdUtente(idUtente);
	}

	public Utente() {
		System.out.println("Spring costruisce l'Utente");
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getIdUtente() {
		System.out.println("getId");
		return idUtente;
	}

	public void setIdUtente(int idUtente) {
		System.out.println("SetId");
		this.idUtente = idUtente;
	}

	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", cognome=" + cognome + ", mail=" + mail + ", telefono=" + telefono
				+ ", idUtente=" + idUtente + "]";
	}	
	
	
}
