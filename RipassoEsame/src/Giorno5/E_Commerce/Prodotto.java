package Giorno5.E_Commerce;

public abstract class Prodotto {
	private String nome;
	private double prezzo;
	
	public Prodotto(String nome, double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
}

