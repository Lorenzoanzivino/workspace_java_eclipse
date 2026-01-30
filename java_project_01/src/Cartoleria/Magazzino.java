package Cartoleria;

import java.util.ArrayList; // Import fondamentale

public class Magazzino {
	// Corretto Arraylist in ArrayList. Uso il camelCase standard per la variabile.
	private ArrayList<Prodotto> listaProdotti = new ArrayList<>();

	// 1. Caricamento articoli
	public void aggiungiProdotto(Prodotto p) {
		listaProdotti.add(p);
	}

	// 2. Stampa elenco articoli
	public void stampaArticoli() {
		System.out.println("--- Elenco Articoli ---");
		for (int i = 0; i < listaProdotti.size(); i++) {
			System.out.println(i + ") " + listaProdotti.get(i));
		}
	}

	// 3 & 4. Stampa costi e ricavi totali
	public void stampaTotali() {
		double costi = 0;
		double ricavi = 0;

		for (Prodotto p : listaProdotti) {
			costi += p.getCosto();
			ricavi += p.getPrezzoVendita();
		}

		System.out.println("\n--- Totali ---");
		System.out.println("Totale Costi: " + costi);
		System.out.println("Totale Ricavi: " + ricavi);
	}

	// Funzionalità extra: rimozione
	public void rimuoviProdotto(int indice) {
		if (indice >= 0 && indice < listaProdotti.size()) {
			listaProdotti.remove(indice);
		}
	}
}