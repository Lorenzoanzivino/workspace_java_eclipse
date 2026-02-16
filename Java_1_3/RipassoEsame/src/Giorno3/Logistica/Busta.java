package Giorno3.Logistica;

public class Busta extends Collo{
	public Busta(String mittente, double peso) {
		super(mittente, peso);
	}
	
	@Override
	public double getCostoSpedizione() {
		return 2.00;
	}

}
