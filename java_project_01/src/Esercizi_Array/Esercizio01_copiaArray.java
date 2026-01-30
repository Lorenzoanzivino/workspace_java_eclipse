package Esercizi_Array;

import java.util.Scanner;

public class Esercizio01_copiaArray {

	public static void main(String[] args) {
		/*
		 * Esercizio n. 1 – copia array Letto in input un array A di n numeri interi,
		 * creare un secondo array della stessa dimensione e popolarlo copiando tutti
		 * gli elementi del primo
		 */

		Scanner sc = new Scanner(System.in);

		int[] arrayA = new int[5];
		int[] arrayB = new int[arrayA.length];

		System.out.println("Inserisci 5 numeri interi:");
		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = sc.nextInt();
		}
		sc.close();

		// Copia degli elementi
		for (int i = 0; i < arrayA.length; i++) {
			arrayB[i] = arrayA[i];
		}

		sc.close();

		System.out.println("Array B copiato:");
		for (int num : arrayB) {
			System.out.print(num + " ");
		}
	}

}
