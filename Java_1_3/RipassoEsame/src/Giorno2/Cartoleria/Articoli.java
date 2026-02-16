package Giorno2.Cartoleria;

// SUPER CLASSE ATTRIBUTI GENERICI
public class Articoli {
	private String marca;
	private String modello;
	private double costo;
	
	public Articoli(String marca, String modello, double costo, double prezzoVendita) {
		this.marca = marca;
		this.modello = modello;
		this.setCosto(costo);
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModello() {
		return modello;
	}
	
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}

	public double getPrezzoVendita() {
		return costo * 2;
	}
}
