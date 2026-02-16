package Traghetto.Veicoli;

import java.util.ArrayList;
import java.util.List;

import Traghetto.Interfaccia.Tariffabile;
import Traghetto.Modello_base.Persona;

public abstract class Veicolo implements Tariffabile {

	private String targa;
	protected List<Persona> passeggeri;

	public Veicolo(String targa) {
		this.targa = targa;
		this.passeggeri = new ArrayList<>();
	}

	public void aggiungiPasseggero(Persona p) {
		passeggeri.add(p);
	}

	public String getTarga() {
		return targa;
	}

	public List<Persona> getPasseggeri() {
		return passeggeri;
	}

	// tariffa passeggeri = 2.5 per ogni persona
	protected double costoPasseggeri() {
		return passeggeri.size() * 2.5;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " - Targa: " + targa + ", Passeggeri: " + passeggeri.size();
	}
}
