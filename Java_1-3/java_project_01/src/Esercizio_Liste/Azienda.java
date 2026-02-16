package Esercizio_Liste;

import java.util.ArrayList;

import Esercizi_Ereditarieta.Impiegato;

public class Azienda {
	private ArrayList<Impiegato> dipendenti = new ArrayList<>();

	public void assumi(Impiegato i) {
		dipendenti.add(i);
	}

	public void licenzia(Impiegato i) throws RuntimeException {
		if (dipendenti.contains(i)) {
			dipendenti.remove(i);
		} else {
			throw new RuntimeException("Errore");
		}
	}

	public void incrementaSalarioPerTutti(double aumento) {
		for (Impiegato imp : dipendenti) {
			imp.incrSalario(aumento);
		}
	}

}
