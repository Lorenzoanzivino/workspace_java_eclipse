package ArcaDiNoe;

public class Cane extends AnimaleTerrestre {

	@Override
	public String verso() {
		return "Bau bau";
	}

	@Override
	public String toString() {
		return categoria() + " - Sono un Cane - verso: " + verso();
	}
}