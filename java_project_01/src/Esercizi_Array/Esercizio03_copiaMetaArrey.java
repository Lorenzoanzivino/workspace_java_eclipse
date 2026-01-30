package Esercizi_Array;

import java.util.Scanner;

public class Esercizio03_copiaMetaArrey {

	public static void main(String[] args) {
		/*
		 * Esercizio n. 3 - copia metà array Creare un array A di n numeri interi,
		 * popolarlo dinamicamente SOLO per metà e stamparlo. Popolare poi la seconda
		 * metà con gli stessi valori della prima e stampare nuovamente. NB: per
		 * semplicità assumiamo che la dimensione dell’array sia un numero pari. Es.
		 * creo un array da 10 elementi e lo popolo con questi 5 valori (3, 5, 8, 2, 4).
		 * Alla fine l'array deve diventare (3, 5, 8, 2, 4, 3, 5, 8, 2, 4).
		 */
		Scanner sc = new Scanner(System.in);

		int[] arrayA = new int[10];

		System.out.println("Inserisci 10 numeri interi:");
		for (int i = 0; i < arrayA.length / 2; i++) {
			arrayA[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < arrayA.length / 2; i++) {
			arrayA[i + arrayA.length / 2] = arrayA[i];

			System.out.println(arrayA[i]);
		}

	}

}
