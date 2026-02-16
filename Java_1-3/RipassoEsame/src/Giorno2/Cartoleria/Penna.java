package Giorno2.Cartoleria;

// SOTTOCLASSE DI ARTICOLI CON ATTRIBUTI SPECIFICI
public class Penna extends Articoli {
	private String colore;
	
	public Penna (String marca, String modello, double costo, double prezzoVendita, String colore){
		super(marca, modello, costo, prezzoVendita);
		this.setColore(colore);
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	@Override
	public String toString() {
	    return "Penna [marca=" + getMarca() + ", modello=" + getModello() + 
	           ", colore=" + colore + ", prezzoVendita=" + getPrezzoVendita() + "]";
	}
}
