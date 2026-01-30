package ArcaDiNoe;

public class Canarino extends AnimaleVolatile {

	@Override
	public String verso() {
		return "Cip cip";
	}

	@Override
	public String toString() {
		return categoria() + " - Sono un Canarino - verso: " + verso();
	}
}