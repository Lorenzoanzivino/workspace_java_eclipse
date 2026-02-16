package Cartoleria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Magazzino magazzino = new Magazzino();
		boolean running = true;

		while (running) {
			System.out.println("\n--- GESTIONE CARTOLERIA ---");
			System.out.println("1. Aggiungi Penna");
			System.out.println("2. Aggiungi Gomma");
			System.out.println("3. Stampa elenco articoli");
			System.out.println("4. Stampa totali (Costi e Ricavi)");
			System.out.println("5. Rimuovi articolo");
			System.out.println("0. Esci");
			System.out.print("Scelta: ");

			int scelta = scanner.nextInt();
			scanner.nextLine(); // Consuma il resto della riga (invio)

			switch (scelta) {
			case 1:
				System.out.print("Inserisci Nome: ");
				String nomeP = scanner.nextLine();
				System.out.print("Inserisci Marca: ");
				String marcaP = scanner.nextLine();
				System.out.print("Inserisci Costo: ");
				double costoP = scanner.nextDouble();
				scanner.nextLine(); // pulizia buffer
				System.out.print("Inserisci Colore: ");
				String colore = scanner.nextLine();

				Penna penna = new Penna(nomeP, marcaP, costoP, colore);
				magazzino.aggiungiProdotto(penna);
				break;

			case 2:
				System.out.print("Inserisci Nome: ");
				String nomeG = scanner.nextLine();
				System.out.print("Inserisci Marca: ");
				String marcaG = scanner.nextLine();
				System.out.print("Inserisci Costo: ");
				double costoG = scanner.nextDouble();
				System.out.print("Inserisci Dimensioni (intero): ");
				int dim = scanner.nextInt();
				scanner.nextLine(); // pulizia buffer
				System.out.print("Inserisci Forma: ");
				String forma = scanner.nextLine();

				Gomma gomma = new Gomma(nomeG, marcaG, costoG, dim, forma);
				magazzino.aggiungiProdotto(gomma);
				break;

			case 3:
				magazzino.stampaArticoli();
				break;

			case 4:
				magazzino.stampaTotali();
				break;

			case 5:
				System.out.print("Inserisci indice da rimuovere: ");
				int idx = scanner.nextInt();
				magazzino.rimuoviProdotto(idx);
				break;

			case 0:
				running = false;
				System.out.println("Programma terminato.");
				break;

			default:
				System.out.println("Scelta non valida.");
			}
		}
		scanner.close();
	}
}