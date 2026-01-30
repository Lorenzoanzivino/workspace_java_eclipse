package Esercizi_ripasso;

import java.util.Scanner;

public class Esercizio03_Fattoriale {

	public static void main(String[] args) {
		/*
		 * Esercizio n. 3 Letto dalla tastiera un numero intero n > 0, stampare il
		 * fattoriale di n. Definizione di fattoriale: per n>1 n! = n * ( n -1 ) * ( n
		 * -2 )... * 1. Per n= 1, n! = 1
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Inserisci un numero intero > 0: ");
		int n = sc.nextInt();

		long risultatoFattoriale = 1;
		for (long i = n; i > 1; i--) {
			risultatoFattoriale *= i;
		}

		System.out.println("Il Fattoriale di n è: " + risultatoFattoriale);

		sc.close();
	}

}
