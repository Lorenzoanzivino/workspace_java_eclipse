package Geometria;

import java.util.Scanner;

public class Geometria {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int continua;

		do {
			int forma;
			do {
				System.out.println("Inserire la forma (0 = Cerchio; 1 = Rettangolo):");
				forma = scan.nextInt();

				if (forma != 0 && forma != 1) {
					System.out.println("Errore: Inserisci 0 o 1!");
				}
			} while (forma != 0 && forma != 1);

			if (forma == 0) {
				double raggio;
				do {
					System.out.println("Inserire il raggio:");
					raggio = scan.nextDouble();
					if (raggio <= 0) {
						System.out.println("Errore: Inserire un numero positivo!");
					}
				} while (raggio <= 0);

				Cerchio circle = new Cerchio(raggio);
				int scelta = chiediScelta(scan);
				if (scelta == 0)
					System.out.println("Il perimetro è: " + circle.calcolaPerimetro());
				else
					System.out.println("L'area è: " + circle.calcolaArea());

			} else {
				int base, altezza;
				do {
					System.out.println("Inserire la base:");
					base = scan.nextInt();
					if (base <= 0)
						System.out.println("Errore: Inserire un numero positivo!");
				} while (base <= 0);

				do {
					System.out.println("Inserire l'altezza:");
					altezza = scan.nextInt();
					if (altezza <= 0)
						System.out.println("Errore: Inserire un numero positivo!");
				} while (altezza <= 0);

				Rettangolo rectangle = new Rettangolo(base, altezza);
				int scelta = chiediScelta(scan);
				if (scelta == 0)
					System.out.println("Il perimetro è: " + rectangle.calcolaPerimetro());
				else
					System.out.println("L'area è: " + rectangle.calcolaArea());
			}

			System.out.println("\nVuoi creare un'altra figura? (0 = No; 1 = Sì):");
			continua = scan.nextInt();

		} while (continua == 1);

		scan.close();
		System.out.println("Programma terminato.");
	}

	// Metodo di utilità per chiedere se perimetro o area
	private static int chiediScelta(Scanner scan) {
		int scelta;
		do {
			System.out.println("Vuoi il perimetro o l'area? (0 = Perimetro; 1 = Area):");
			scelta = scan.nextInt();
			if (scelta != 0 && scelta != 1) {
				System.out.println("Errore: Inserisci 0 o 1!");
			}
		} while (scelta != 0 && scelta != 1);
		return scelta;
	}
}
