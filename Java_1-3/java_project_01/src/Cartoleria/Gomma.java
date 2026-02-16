package Cartoleria;

public class Gomma extends Prodotto {
	private int dimensioni;
	private String forma;

	// Costruttore: Rimosso prezzoVendita
	public Gomma(String nome, String marca, double costo, int dimensioni, String forma) {
		super(nome, marca, costo);
		this.dimensioni = dimensioni;
		this.forma = forma;
	}

	public int getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	@Override
	public String toString() {
		return super.toString() + ", Dimensioni: " + dimensioni + ", Forma: " + forma;
	}
}