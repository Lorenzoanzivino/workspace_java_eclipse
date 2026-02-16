package Giorno3.Distributore;

public class Panino extends Prodotto implements Scaldabile{
	public Panino(String nome, double prezzo, boolean isScaduto) {
		super(nome, prezzo, isScaduto);
	}
	
	@Override
	public void consuma() throws Exception{
		if(getIsScaduto() == true) {
			throw new Exception("BLEAH! Prodotto: " + getNome() + " è scaduta!");
		}
		System.out.println("Sto mangiando il panino: " + getNome());
	}
	
	@Override
	public void riscalda() {
		System.out.println(getNome() + " si sta scaldando... ding!");
	}

}
