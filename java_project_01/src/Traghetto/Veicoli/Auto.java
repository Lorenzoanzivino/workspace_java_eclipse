package Traghetto.Veicoli;

public class Auto extends Veicolo {

	public enum Tipo {
		MINI, STANDARD, SUV
	}

	private Tipo tipo;

	public Auto(String targa, Tipo tipo) {
		super(targa);
		this.tipo = tipo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	@Override
	public double calcolaTariffa() {
		double tariffaBase;
		switch (tipo) {
		case MINI:
			tariffaBase = 4.0;
			break;
		case STANDARD:
			tariffaBase = 5.0;
			break;
		case SUV:
			tariffaBase = 8.5;
			break;
		default:
			tariffaBase = 0;
		}

		// aggiungi costo passeggeri
		return tariffaBase + costoPasseggeri();
	}

	@Override
	public String toString() {
		return super.toString() + ", Tipo: " + tipo + ", Tariffa: " + calcolaTariffa();
	}
}
