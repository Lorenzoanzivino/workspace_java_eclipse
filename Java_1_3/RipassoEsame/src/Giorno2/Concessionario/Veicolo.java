package Giorno2.Concessionario;

public abstract class Veicolo {
	private String marca;
	private int anno;
	
	public Veicolo(String marca, int anno){
		this.marca = marca;
		this.anno = anno;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public int getAnno() {
		return anno;
	}
	
	public void info() {
		System.out.println("Veicolo generato: " + marca + " anno: " + anno);
	}
	
	public abstract double calcolaBollo();
	
}
