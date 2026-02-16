package Giorno2.Gestionale;

public class Manager extends Dipendente{
	private int numeroTeam;
	
	public Manager(String nome, double stipendioBase, int numeroTeam) {
		super(nome, stipendioBase);
		this.numeroTeam = numeroTeam;
	}
	
	public int getNumeroTeam() {
		return numeroTeam;
	}
	
	@Override
	public double calcolaStipendio() {
		if(numeroTeam > 10) {
			return getStipendioBase() + (100 * numeroTeam) + 500;
		}else {
			return getStipendioBase() + (100 * numeroTeam);
		}
	}
}
