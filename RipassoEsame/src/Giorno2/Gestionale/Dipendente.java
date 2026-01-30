package Giorno2.Gestionale;

public class Dipendente {
	private String nome;
	private double stipendioBase;
	
	public Dipendente(String nome, double stipendioBase) {
		this.nome = nome;
		this.setStipendioBase(stipendioBase);
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getStipendioBase() {
		return stipendioBase;
	}
	
	public void setStipendioBase(double stipendioBase) {
		this.stipendioBase = stipendioBase;
	}
	
	public double calcolaStipendio() {
		return stipendioBase;
	}

}
