package Giorno3.Logistica;

public abstract class Collo {
	private String mittente;
	private double peso;
	
	public Collo(String mittente, double peso) {
		this.mittente = mittente;
		this.peso = peso;
	}
	
	public String getMittente() {
		return mittente;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public abstract double getCostoSpedizione() throws Exception;
}
