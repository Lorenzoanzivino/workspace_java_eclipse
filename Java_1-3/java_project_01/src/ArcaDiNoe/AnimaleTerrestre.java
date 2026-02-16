package ArcaDiNoe;

public abstract class AnimaleTerrestre implements Animale {

	@Override
	public String categoria() {
		return "Animale terrestre";
	}

	@Override
	public String toString() {
		return categoria() + " - " + getClass().getSimpleName() + " - verso: " + verso();
	}
}