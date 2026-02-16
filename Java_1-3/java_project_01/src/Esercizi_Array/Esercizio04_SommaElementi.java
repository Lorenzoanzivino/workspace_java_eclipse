package Esercizi_Array;

import java.util.Scanner;

public class Esercizio04_SommaElementi {

	public static void main(String[] args) {
		/*
		 * Esercizio n. 4 – somma elementi array Creare un array A di n numeri interi e
		 * popolarlo dinamicamente. Calcolare e stampare: • la somma di tutti gli
		 * elementi • la somma degli elementi di posto pari (il posto zero viene contato
		 * nei pari!) • la somma degli elementi di posto dispari • la media aritmetica
		 * di tuti gli elementi
		 */
		Scanner sc = new Scanner(System.in);

		int[] arrayA = new int[5];

		System.out.println("Inserisci 5 numeri interi:");
		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = sc.nextInt();
		}
		sc.close();

		// 1. Somma totale
		int sommaTotale = 0;
		for (int num : arrayA) {
			sommaTotale += num;
		}

		// 2. Somma posizioni pari (0,2,4,...)
		int sommaPari = 0;
		for (int i = 0; i < arrayA.length; i++) {
			if (i % 2 == 0) {
				sommaPari += arrayA[i];
			}
		}

		// 3. Somma posizioni dispari (1,3,5,...)
		int sommaDispari = 0;
		for (int i = 0; i < arrayA.length; i++) {
			if (i % 2 != 0) {
				sommaDispari += arrayA[i];
			}
		}

		// 4. Media di tutti gli elementi
		double media = (double) sommaTotale / arrayA.length;

		// Output ordinato
		System.out.println("Somma totale: " + sommaTotale);
		System.out.println("Somma posizioni pari: " + sommaPari);
		System.out.println("Somma posizioni dispari: " + sommaDispari);
		System.out.println("Media: " + media);
	}
}
