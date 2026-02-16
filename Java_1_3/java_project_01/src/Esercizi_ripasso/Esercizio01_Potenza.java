package Esercizi_ripasso;

import java.util.Scanner; // Importiamo lo strumento per leggere da tastiera

public class Esercizio01_Potenza {

	public static void main(String[] args) {

		// 1. Prepariamo lo Scanner per leggere l'input dell'utente
		Scanner scanner = new Scanner(System.in);

		// 2. Chiediamo e leggiamo la base (n)
		System.out.print("Inserisci la base (n): ");
		int n = scanner.nextInt();

		// 3. Chiediamo e leggiamo l'esponente (k)
		System.out.print("Inserisci l'esponente (k): ");
		int k = scanner.nextInt();
		// --- INIZIO LOGICA CICLO ---

		// 1. Inizializziamo il risultato a 1.
		// Perché 1 e non 0? Perché 1 è l'elemento neutro della moltiplicazione.
		// Se partissimo da 0, il risultato sarebbe sempre 0 (0 * n = 0).
		int risultato = 1;

		// 2. Eseguiamo un ciclo che si ripete K volte
		for (int i = 0; i < k; i++) {
			risultato = risultato * n;
			// Esempio con 2 alla 3:
			// Giro 1: 1 * 2 = 2
			// Giro 2: 2 * 2 = 4
			// Giro 3: 4 * 2 = 8 <- Finito
		}

		// --- FINE LOGICA CICLO ---

		// 5. Stampiamo il risultato
		System.out.println("Il risultato di " + n + " elevato alla " + k + " è: " + risultato);

		// 6. Chiudiamo lo scanner (buona norma per liberare memoria)
		scanner.close();
	}
}