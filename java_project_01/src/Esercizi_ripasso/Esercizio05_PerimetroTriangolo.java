package Esercizi_ripasso;

import java.util.Scanner;

public class Esercizio05_PerimetroTriangolo {

	public static void main(String[] args) {
		/*
		 * Esercizio n. 5 (Perimetro del triangolo) Siano dati 2 punti nel piano
		 * cartesiano A (x1, y1) e B (x2, y2). Considerare il triangolo rettangolo che
		 * si ottiene aggiungendo il punto C(x2,y1). Scrivere un programma che legge in
		 * ingresso i valori x1, y1 e x2, y2, calcola e stampa il perimetro del
		 * triangolo ottenuto secondo le regole suddette. Esempio: se x1 = 1, y1 = 1 e
		 * x2 = 2, y2= 2 allora il perimetro sarà 3.414213562373095 Nota: utilizzare le
		 * funzioni della libreria matematica Math per calcolare potenze, radici
		 * quadrate, ecc
		 */

		Scanner sc = new Scanner(System.in);

		// 1. Input Guidato
		System.out.println("Inserisci le coordinate del Punto A (x1, y1):");
		System.out.print("x1: ");
		int x1 = sc.nextInt();
		System.out.print("y1: ");
		int y1 = sc.nextInt();

		// 1. Input Guidato
		System.out.println("Inserisci le coordinate del Punto B (x2, y2):");
		System.out.print("x2: ");
		int x2 = sc.nextInt();
		System.out.print("y2: ");
		int y2 = sc.nextInt();

		sc.close();

		int Cateto_AC = Math.abs(x2 - x1);
		System.out.println("Il Cateto_AC: " + Cateto_AC);
		int Cateto_BC = Math.abs(y2 - y1);
		System.out.println("Il Cateto_BC: " + Cateto_BC);

		double Ipotenusa_AB = Math.sqrt(Math.pow(Cateto_AC, 2) + Math.pow(Cateto_BC, 2));
		System.out.println("L'Ipotenusa_AB: " + Ipotenusa_AB);

		double Perimetro = Cateto_AC + Cateto_BC + Ipotenusa_AB;
		System.out.println("Il Perimetro: " + Perimetro);
	}

}
