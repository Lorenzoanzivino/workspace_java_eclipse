package Traghetto.Veicoli;

import Traghetto.Modello_base.Persona;

public class Moto extends Veicolo {

	public Moto(String targa) {
		super(targa);
	}

	@Override
	public double calcolaTariffa() {
		return 3.5 + costoPasseggeri(); // tariffa base + passeggeri
	}

	@Override
	public void aggiungiPasseggero(Persona p) {
		if (passeggeri.size() >= 2) {
			throw new IllegalArgumentException("Una moto può avere massimo 2 persone a bordo");
		}
		super.aggiungiPasseggero(p);
	}

	@Override
	public String toString() {
		return super.toString() + ", Tariffa: " + calcolaTariffa();
	}
}
