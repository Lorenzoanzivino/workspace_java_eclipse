package ArcaDiNoe;

public class Airone extends AnimaleVolatile {

	@Override
	public String verso() {
		return "Kraaa";
	}

	@Override
	public String toString() {
		return categoria() + " - Sono un Airone - verso: " + verso();
	}
}