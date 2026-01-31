package Giorno3.Distributore;

public abstract class Prodotto {
	private String nome;
	private double prezzo;
	private boolean isScaduto;
	
	public Prodotto(String nome, double prezzo, boolean isScaduto) {
		this.nome = nome;
		this.setPrezzo(prezzo);
		this.isScaduto = isScaduto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public boolean getIsScaduto() {
		return isScaduto;
	}
	
	public void consuma() throws Exception{
		if (isScaduto == true) {
			throw new Exception("Attenzione! Prodotto " + getNome() + " scaduto");
		}
	}
	
}
