package ArcaDiNoe;

public class Gatto extends AnimaleTerrestre {

	@Override
	public String verso() {
		return "Miao";
	}

	@Override
	public String toString() {
		return categoria() + " - Sono un Gatto - verso: " + verso();
	}
}
