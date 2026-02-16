package IlTraffico;

public class Automobile {
	// 1. Dichiarazione dei campi
	private String marca;
	private String modello;
	private String targa;

	// 2. Costruttore
	public Automobile(String marca, String modello, String targa) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.targa = targa;

	}

	public String getMarca() {
		return marca;
	}

	public String getModello() {
		return modello;
	}

	public String getTarga() {
		return targa;
	}

	@Override
	public String toString() {
		return "Automobile [marca=" + marca + ", modello=" + modello + ", targa=" + targa + "]";
	}
}
