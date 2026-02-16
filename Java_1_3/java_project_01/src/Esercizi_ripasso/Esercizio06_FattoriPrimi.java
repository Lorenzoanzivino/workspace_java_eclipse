package Esercizi_ripasso;

import java.util.Scanner;

public class Esercizio06_FattoriPrimi {

	public static void main(String[] args) {
		/*
		 * Esercizio n. 6 Letto dalla tastiera un numero intero n > 0, eseguire la
		 * scomposizione in fattori primi, stampando tutti i divisori. Esempio: inserito
		 * 12, la scomposizione sarebbe 12 * 3, cioè 4*3. Il programma deve stampare
		 * 2*2*3 Se il numero fosse primo, il programma avvisa con la stampa “il numero
		 * è primo”
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Inserisci un numero intero > 0: ");
		int n = sc.nextInt();
		sc.close();

		int divisore = 2;
		int numero_originale = n;
		int count = 0;

		System.out.print("Scomposizione di " + numero_originale + ": ");

		while (n > 1) {
			while (n % divisore == 0) {
				if (count > 0) {
					System.out.print(" * ");
				}
				System.out.print(divisore);

				n /= divisore;
				count++;
			}
			divisore++;
		}
		System.out.println();

		if (count == 1 && numero_originale > 1) {
			System.out.println("Il numero " + numero_originale + " è primo.");
		} else if (numero_originale <= 1) {
			System.out.println("Il numero deve essere maggiore di 1");
		} else {

		}
	}

}
