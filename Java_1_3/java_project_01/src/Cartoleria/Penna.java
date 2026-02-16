package Cartoleria;

public class Penna extends Prodotto {
	private String colore;

	public Penna(String nome, String marca, double costo, String colore) {
		super(nome, marca, costo);
		this.colore = colore;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	@Override
	public String toString() {
		return super.toString() + ", Colore: " + colore;
	}
}
