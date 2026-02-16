package ArcaDiNoe;

public abstract class AnimaleVolatile implements Animale {

	@Override
	public String categoria() {
		return "Animale volatile";
	}

	@Override
	public String toString() {
		return categoria() + " - " + getClass().getSimpleName() + " - verso: " + verso();
	}
}