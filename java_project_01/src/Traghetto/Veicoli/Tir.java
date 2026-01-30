package Traghetto.Veicoli;

import Traghetto.Modello_base.Persona;

public class Tir extends Veicolo {

	private double tonnellateMerce;

	public Tir(String targa, double tonnellateMerce) {
		super(targa);
		this.tonnellateMerce = tonnellateMerce;
	}

	public double getTonnellateMerce() {
		return tonnellateMerce;
	}

	public void setTonnellateMerce(double tonnellateMerce) {
		this.tonnellateMerce = tonnellateMerce;
	}

	@Override
	public double calcolaTariffa() {
		return 12.5 + costoPasseggeri() + (tonnellateMerce * 0.5);
	}

	@Override
	public void aggiungiPasseggero(Persona p) {
		if (passeggeri.size() >= 3) {
			throw new IllegalArgumentException("Un tir può avere massimo 3 persone a bordo");
		}
		super.aggiungiPasseggero(p);
	}

	@Override
	public String toString() {
		return super.toString() + ", Tonnellate merce: " + tonnellateMerce + ", Tariffa: " + calcolaTariffa();
	}
}
