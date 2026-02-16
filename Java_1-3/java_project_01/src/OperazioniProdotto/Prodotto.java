package OperazioniProdotto;

public class Prodotto {
	private int codice;
	private String descrizione;
	private String categoria;
	private int quantita;
	private boolean disponibile;
	private double prezzo;
	private double sconto;

	public Prodotto(int codice, String descrizione, String categoria, int quantita, boolean disponibile, double prezzo,
			double sconto) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.categoria = categoria;
		this.quantita = quantita;
		this.disponibile = disponibile;
		this.prezzo = prezzo;
		this.sconto = sconto;
	}

	// Getter
	public int getCodice() {
		return codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public String getCategoria() {
		return categoria;
	}

	public int getQuantita() {
		return quantita;
	}

	public boolean isDisponibile() {
		return disponibile;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public double getSconto() {
		return sconto;
	}
}
