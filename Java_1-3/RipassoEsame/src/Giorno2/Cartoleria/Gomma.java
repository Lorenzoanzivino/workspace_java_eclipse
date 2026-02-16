package Giorno2.Cartoleria;

public class Gomma extends Articoli {
	private double dimensioni;
	private String forma;
	
	public Gomma(String marca, String modello, double costo, double prezzoVendita, double dimensioni, String forma) {
		super(marca, modello, costo, prezzoVendita);
		this.dimensioni = dimensioni;
		this.forma = forma;
	}
	
	public double getDimensioni() {
		return dimensioni;
	}
	public String getForma() {
		return forma;
	}
	
	@Override
	public String toString() {
	    return "Gomma [marca=" + getMarca() + ", modello=" + getModello() + 
	           ", dimensioni=" + dimensioni + ", forma=" + forma + 
	           ", prezzoVendita=" + getPrezzoVendita() + "]";
	}

}
