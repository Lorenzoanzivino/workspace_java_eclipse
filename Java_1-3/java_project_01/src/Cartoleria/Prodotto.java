package Cartoleria;

public class Prodotto {
	private String nome;
	private String marca;
	private double costo; // Ho mantenuto double per precisione monetaria
	private double prezzoVendita;

	// Costruttore: prezzoVendita calcolato automaticamente
	public Prodotto(String nome, String marca, double costo) {
		this.nome = nome;
		this.marca = marca;
		this.costo = costo;
		this.prezzoVendita = costo * 2;
	}

	// Getters
	public double getCosto() {
		return costo;
	}

	public double getPrezzoVendita() {
		return prezzoVendita;
	}

	public String getNome() {
		return nome;
	}

	public String getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Marca: " + marca + ", Costo: " + costo + ", Prezzo: " + prezzoVendita;
	}
}