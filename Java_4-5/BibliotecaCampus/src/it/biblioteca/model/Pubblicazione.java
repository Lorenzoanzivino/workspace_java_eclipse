package it.biblioteca.model;

public abstract class Pubblicazione {
	private String codicePub;
	private String titolo;
	private String casaEditrice;
	private int numeroCopie;
	private double prezzoBase;

	// Costruttore
	public Pubblicazione(String codicePub, String titolo, String casaEditrice, int numeroCopie, double prezzoBase) {
		this.setCodicePub(codicePub);
		this.setTitolo(titolo);
		this.setCasaEditrice(casaEditrice);
		this.setNumeroCopie(numeroCopie);
		this.setPrezzoBase(prezzoBase);
	}

	// Getter e setter
	public String getCodicePub() {
		return codicePub;
	}

	public void setCodicePub(String codicePub) {
		this.codicePub = codicePub;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getCasaEditrice() {
		return casaEditrice;
	}

	public void setCasaEditrice(String casaEditrice) {
		this.casaEditrice = casaEditrice;
	}

	public int getNumeroCopie() {
		return numeroCopie;
	}

	public void setNumeroCopie(int numeroCopie) {
		this.numeroCopie = numeroCopie;
	}

	public double getPrezzoBase() {
		return prezzoBase;
	}

	public void setPrezzoBase(double prezzoBase) {
		this.prezzoBase = prezzoBase;
	}

	public void incrementaNumCopie(int n) {
		numeroCopie += n;
	}

	public void decrementaNumCopie(int n) {
		numeroCopie -= n;
	}

}
