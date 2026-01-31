package Giorno3.Distributore;

public class Merendina extends Prodotto {
	
	public Merendina(String nome, double prezzo, boolean isScaduto) {
		super(nome, prezzo, isScaduto);
	}
	
	@Override
	public void consuma() throws Exception{
		if(getIsScaduto() == true) {
			throw new Exception("BLEAH! Prodotto: " + getNome() + " è scaduta!");
		}
		System.out.println("Gnam gnam, che buono " + getNome());
	}

}
