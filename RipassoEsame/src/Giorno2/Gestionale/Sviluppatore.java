package Giorno2.Gestionale;

public class Sviluppatore extends Dipendente {
	private double bonus;
	
	public Sviluppatore(String nome, double stipendioBase, double bonus) {
		super(nome, stipendioBase);
		this.bonus = bonus;
		
	}
	
	public double getBonus() {
		return bonus;
	}
	

	
	@Override
	public double calcolaStipendio() {
		return getStipendioBase() + bonus;
		
	}
}
