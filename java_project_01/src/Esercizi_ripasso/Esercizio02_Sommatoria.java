package Esercizi_ripasso;

import java.util.Scanner;

public class Esercizio02_Sommatoria {

	public static void main(String[] args) {
		// Esercizio n. 2 (Sommatoria)
		// Scrivere un programma che legge dalla tastiera due interi n >0 e k >0 e
		// stampa il risultato della sommatoria
		// k + k2+ k3+...+ kn.

		Scanner sc = new Scanner(System.in);

		// 1. Leggiamo n (che sarà il numero di termini, ovvero l'esponente massimo)
		System.out.print("Inserisci n (esponente massimo): ");
		int n = sc.nextInt();
		// 2. Leggiamo k (che è la base che viene moltiplicata)
		System.out.print("Inserisci k (base): ");
		int k = sc.nextInt();

		// Variabile per la somma totale (parte da 0 perché è una somma)
		int sommaTotale = 0;

		// Variabile per la potenza temporanea (parte da 1 per le moltiplicazioni)
		int potenzaCorrente = 1;

		// 3. Ciclo che va da 1 fino a n
		for (int i = 1; i <= n; i++) {
			potenzaCorrente = potenzaCorrente * k;

			// Aggiungiamo la potenza appena calcolata al totale
			sommaTotale = sommaTotale + potenzaCorrente;
			System.out.println("Giro " + i + ": aggiungo " + potenzaCorrente);
		}
		System.out.println("La sommatoria finale è: " + sommaTotale);

		sc.close();
	}
}
