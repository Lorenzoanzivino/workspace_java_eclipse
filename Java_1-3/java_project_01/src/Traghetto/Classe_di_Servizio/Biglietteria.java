package Traghetto.Classe_di_Servizio;

import java.util.LinkedList;
import java.util.Queue;

import Traghetto.Eccezione.CodaVuotaException;
import Traghetto.Interfaccia.Tariffabile;

public class Biglietteria {

	private double cassa;
	private Queue<Tariffabile> coda;

	public Biglietteria() {
		this.cassa = 0;
		this.coda = new LinkedList<>();
	}

	public void aggiungiInCoda(Tariffabile t) {
		coda.add(t);
	}

	public Tariffabile riceviPagamento() {
		if (coda.isEmpty()) {
			throw new CodaVuotaException("La coda è vuota, nessuno da far pagare!");
		}

		Tariffabile ente = coda.poll(); // prende e rimuove
		double tariffa = ente.calcolaTariffa();
		cassa += tariffa;

		return ente; // lo restituisce dopo aver pagato
	}

	public double getCassa() {
		return cassa;
	}

	public int getLunghezzaCoda() {
		return coda.size();
	}
}
