package Giorno2.ArenaGladiatori;

public class Mago extends Personaggio{
	private int mana;
	
	public Mago(String nome, int puntiVita, int attaccoBase, int mana) {
		super(nome, puntiVita, attaccoBase);
		this.mana = mana;
	}
	
	public int getMana() {
		return mana;
	}
	
	@Override
	public int attacca() {
		if (mana >= 10) {
			mana -= 10;
			System.out.println("Mago lancia... Palla di Fuoco");
			return getAttaccoBase() + 50;
		}else {
			System.out.println("Mago senza mana... attacco debole");
			return 1;
		}
		 
	}

}
