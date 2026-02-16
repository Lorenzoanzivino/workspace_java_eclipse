package Esercizi_Array;

import java.util.Scanner;

public class Esercizio02_inversioneArray {

	public static void main(String[] args) {
		/*
		 * Esercizio n. 2 - inversione array Letto in input un array A di n numeri
		 * interi, creare un secondo array B della stessa dimensione e popolarlo
		 * invertendo l’ordine degli elementi del primo. Esempio: se A è (10,27,13, 4),
		 * allora devo ottenere B (4,13,27,10) Al termine dell’elaborazione stampare gli
		 * array A e B.
		 */

		Scanner sc = new Scanner(System.in);

		int[] arrayA = new int[5];
		int[] arrayB = new int[arrayA.length];

		System.out.println("Inserisci 5 numeri interi:");
		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = sc.nextInt();
		}
		sc.close();

		// Inversione dell'array
		for (int i = 0; i < arrayA.length; i++) {
			arrayB[i] = arrayA[arrayA.length - 1 - i];
		}

		// Stampa di A
		System.out.println("Array A:");
		for (int num : arrayA) {
			System.out.print(num + " ");
		}

		System.out.println("\nArray B (inverso):");
		for (int num : arrayB) {
			System.out.print(num + " ");
		}
	}
}
