package Giorno1.CinemaMultisala;

public class Main {

	public static void main(String[] args) {

		// --- 1. SETUP INIZIALE ---
		System.out.println("=== APERTURA CINEMA ===");
		// Sala: Joker, Prezzo 10.0, Posti Totali: 2 (Pochissimi!), Età Minima: 18
		SalaCinema sala = new SalaCinema("Joker", 10.0, 2, 18);

		System.out.println("Film in programmazione: " + sala.getTitoloFilm());
		System.out.println("Posti totali: " + sala.getPostiTotali());
		System.out.println("Prezzo biglietto: " + sala.getPrezzoBiglietto() + " euro");
		System.out.println("=======================\n");

		// --- CASO 1: IL BAMBINO (Test Età) ---
		System.out.println("--- TEST 1: TENTATIVO BAMBINO ---");
		Spettatore bimbo = new Spettatore("Paolino", 10, 50.0);
		sala.venditaBiglietto(bimbo);
		// Risultato atteso: Rifiutato per età

		// --- CASO 2: IL POVERO (Test Soldi) ---
		System.out.println("\n--- TEST 2: TENTATIVO SENZA SOLDI ---");
		Spettatore studente = new Spettatore("Marco", 25, 5.0); // Ha solo 5 euro
		sala.venditaBiglietto(studente);
		// Risultato atteso: Rifiutato per fondi insufficienti

		// --- CASO 3: IL PRIMO CLIENTE (Successo) ---
		System.out.println("\n--- TEST 3: CLIENTE PAGANTE 1 ---");
		Spettatore ricco1 = new Spettatore("Elon", 40, 100.0);

		System.out.println("Portafoglio prima: " + ricco1.getPortafoglio());
		sala.venditaBiglietto(ricco1); // Dovrebbe entrare
		System.out.println("Portafoglio dopo: " + ricco1.getPortafoglio());
		System.out.println("Posti occupati attuali: " + sala.getPostiOccupati());

		// --- CASO 4: IL SECONDO CLIENTE (Successo - Sala si riempie) ---
		System.out.println("\n--- TEST 4: CLIENTE PAGANTE 2 ---");
		Spettatore ricco2 = new Spettatore("Jeff", 50, 100.0);

		sala.venditaBiglietto(ricco2); // Dovrebbe entrare
		System.out.println("Posti occupati attuali: " + sala.getPostiOccupati());
		// A questo punto la sala ha 2 posti su 2 occupati. È PIENA.

		// --- CASO 5: LO SFORTUNATO (Test Sala Piena) ---
		System.out.println("\n--- TEST 5: CLIENTE DI TROPPO ---");
		Spettatore ritardatario = new Spettatore("Fantozzi", 55, 100.0);

		sala.venditaBiglietto(ritardatario);
		// Risultato atteso: Rifiutato perché la sala è piena (2 su 2)

		System.out.println("\n=== CHIUSURA CINEMA ===");
	}
}