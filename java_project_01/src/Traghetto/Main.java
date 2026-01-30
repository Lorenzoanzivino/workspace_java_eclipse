package Traghetto;

import Traghetto.Classe_di_Servizio.Biglietteria;
import Traghetto.Interfaccia.Tariffabile;
import Traghetto.Modello_base.Persona;
import Traghetto.Veicoli.Auto;
import Traghetto.Veicoli.Moto;
import Traghetto.Veicoli.Tir;

public class Main {

	public static void main(String[] args) {
		Biglietteria biglietteria = new Biglietteria();

		// --- Persone a piedi ---
		Persona p1 = new Persona("Mario", "Rossi");
		Persona p2 = new Persona("Anna", "Bianchi");
		biglietteria.aggiungiInCoda(p1);
		biglietteria.aggiungiInCoda(p2);

		// --- Auto ---
		Auto auto1 = new Auto("AB123CD", Auto.Tipo.MINI);
		auto1.aggiungiPasseggero(new Persona("Luca", "Verdi"));
		auto1.aggiungiPasseggero(new Persona("Sara", "Neri")); // 2 passeggeri
		biglietteria.aggiungiInCoda(auto1);

		Auto auto2 = new Auto("XY987ZT", Auto.Tipo.SUV);
		auto2.aggiungiPasseggero(new Persona("Giorgio", "Bianchi"));
		biglietteria.aggiungiInCoda(auto2);

		// --- Moto ---
		Moto moto = new Moto("MOTO123");
		moto.aggiungiPasseggero(new Persona("Francesca", "Rossi"));
		biglietteria.aggiungiInCoda(moto);

		// --- Tir ---
		Tir tir = new Tir("TIR456", 10); // 10 tonnellate
		tir.aggiungiPasseggero(new Persona("Marco", "Neri"));
		tir.aggiungiPasseggero(new Persona("Elena", "Verdi"));
		biglietteria.aggiungiInCoda(tir);

		// --- Pagamenti ---
		while (biglietteria.getLunghezzaCoda() > 0) {
			Tariffabile t = biglietteria.riceviPagamento();
			System.out.println("Pagato: " + t);
		}

		System.out.println("Cassa totale: " + biglietteria.getCassa());
	}
}
