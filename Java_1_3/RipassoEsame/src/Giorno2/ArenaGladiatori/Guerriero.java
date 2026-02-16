package Giorno2.ArenaGladiatori;

public class Guerriero extends Personaggio{
	private int rabbia;
	
	public Guerriero(String nome, int puntiVita, int attaccoBase, int rabbia) {
		super(nome, puntiVita, attaccoBase);
		this.rabbia = rabbia;
	}
	
	@Override
	public int attacca() {
		return getAttaccoBase() * rabbia;
	}

}
