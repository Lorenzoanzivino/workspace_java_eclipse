package Esercizi_ripasso;

import java.util.Scanner;

public class Esercizio07_GiorniMeseAnno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("giorno (g): ");
		int g = sc.nextInt();
		System.out.print("mese (m): ");
		int m = sc.nextInt();
		sc.close();

		// =========================================================
		// FASE 1: VALIDAZIONE (Uscita immediata con 'return' in caso di errore)
		// =========================================================

		// 1. Validazione Generale (m deve essere [1-12], g deve essere > 0)
		if (m < 1 || m > 12 || g < 1) {
			System.out.println("valori giorno/mese non coerenti");
			return; // STOP!
		}

		// 2. Validazione Specifica dei Limiti di Giorno (max 31, 28, 30)
		switch (m) {
		case 1, 3, 5, 7, 8, 10, 12:
			if (g > 31) {
				System.out.println("valori giorno/mese non coerenti");
				return;
			}
			break;

		case 2: // Febbraio (Non bisestile)
			if (g > 28) {
				System.out.println("valori giorno/mese non coerenti");
				return;
			}
			break;

		case 4, 6, 9, 11:
			if (g > 30) {
				System.out.println("valori giorno/mese non coerenti");
				return;
			}
			break;
		}

		// Se arriviamo qui, i dati sono VALIDI.

		// =========================================================
		// FASE 2: CALCOLO DELLA SOMMATORIA
		// =========================================================

		int giorniTrascorsi = 0;

		// Ciclo for: Somma i giorni dei mesi che precedono 'm'.
		for (int i = 1; i < m; i++) {
			switch (i) { // i è il mese che stiamo sommando (Gennaio, Febbraio...)
			case 1, 3, 5, 7, 8, 10, 12:
				giorniTrascorsi += 31;
				break;
			case 4, 6, 9, 11:
				giorniTrascorsi += 30;
				break;
			case 2:
				giorniTrascorsi += 28; // Anno NON bisestile
				break;
			}
		}

		// Calcolo finale: Giorni precedenti + giorno attuale - 1
		giorniTrascorsi = giorniTrascorsi + g - 1;

		// =========================================================
		// FASE 3: OUTPUT
		// =========================================================

		System.out.println("dall’inizio dell’anno sono trascorsi " + giorniTrascorsi + " giorni");
	}

}