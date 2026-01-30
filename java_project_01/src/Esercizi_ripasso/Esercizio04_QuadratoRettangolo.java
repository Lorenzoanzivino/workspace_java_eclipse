package Esercizi_ripasso;

import java.util.Scanner;

public class Esercizio04_QuadratoRettangolo {

	public static void main(String[] args) {
		/*
		 * Esercizio n. 4 (Quadrato o rettangolo?)
		 */

		Scanner sc = new Scanner(System.in);

		// 1. Input Guidato
		System.out.println("Inserisci le coordinate del Punto A (x1, y1):");
		System.out.print("x1: ");
		int x1 = sc.nextInt();
		System.out.print("y1: ");
		int y1 = sc.nextInt();

		System.out.println("\nInserisci le coordinate del Punto B (x2, y2):");
		System.out.print("x2: ");
		int x2 = sc.nextInt();
		System.out.print("y2: ");
		int y2 = sc.nextInt();

		sc.close(); // Chiudiamo lo scanner

		// 2. Calcolo dei Lati (L e W)
		// La lunghezza è la differenza assoluta delle coordinate.
		int L = Math.abs(x2 - x1);
		int W = Math.abs(y2 - y1);

		System.out.println("---------------------------------");

		// 3. Verifica: Quadrato o Rettangolo?
		if (L == W) {
			System.out.println("La figura formata dai punti è un QUADRATO.");
		} else {
			System.out.println("La figura formata dai punti è un RETTANGOLO.");
		}

		// 4. Calcolo finale di Area e Perimetro
		// Nota: In Java, la libreria Math non necessita di essere importata
		// separatamente.
		int Area = L * W;
		int Perimetro = 2 * (L + W);

		// 5. Stampa finale dei risultati
		System.out.println("Area: " + Area);
		System.out.println("Perimetro: " + Perimetro);
		System.out.println("---------------------------------");
	}

}