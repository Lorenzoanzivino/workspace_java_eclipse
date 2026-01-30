package SimulazioneDB;

import java.util.ArrayList;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		System.out.println("---- test del gestore TABELLA STUDENTI --------------\n");

		GestioneTabellaTodo d = new GestioneTabellaTodo();
		System.out.println("1. leggi tabella (che ancora non esiste)");
		try {
			if (d.leggiTabella() != null)
				System.out.println("La tabella gia' esiste");
		} catch (TabellaInesistenteException e) {
			System.out.println("tabella inesistente");
		}
		try {
			System.out.println("2. cerco uno studente per matricola, ma la tabella NON esiste ancora");
			System.out.println("Trovato: " + d.cerca(111));
		} catch (MatricolaException e) {
			System.out.println(e.getMessage());
		} catch (TabellaInesistenteException e) {
			System.out.println("tabella inesistente");
		}

		System.out.println("3. carico 3 studenti e QUINDI verrà creata anche la tabella!");
		try {
			d.inserisci(new Studente(111, "guido", "matematica", new Date(120, 2, 5)));
			System.out.println("- Insert studente guido");
			d.inserisci(new Studente(222, "serena", "biologia", new Date(121, 5, 8)));
			System.out.println("- Insert studente serena");
			d.inserisci(new Studente(333, "mara", "economia", new Date(123, 4, 8)));
			System.out.println("- Insert studente mara");

		} catch (MatricolaException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("4. stampo tutti studenti");
		ArrayList<Studente> lista = d.visualizza();
		for (Studente studente : lista) {
			System.out.println(" - " + studente);
		}

		System.out.println("5. cerco studente per matricola");
		try {
			System.out.println("Trovato: " + d.cerca(333));
		} catch (MatricolaException e) {
			System.out.println(e.getMessage());
		} catch (TabellaInesistenteException e) {
			System.out.println("tabella inesistente");
		}

		System.out.println("6. cerco studente con matricola inesistente");
		try {
			System.out.println("Trovato: " + d.cerca(555));
		} catch (MatricolaException e) {
			System.out.println(e.getMessage());
		} catch (TabellaInesistenteException e) {
			System.out.println("tabella inesistente");
		}

		System.out.println("7. cancello uno studente per matricola");
		try {
			System.out.println("Eliminato: " + d.rimuovi(333));
		} catch (MatricolaException e) {
			System.out.println(e.getMessage());
		} catch (TabellaInesistenteException e) {
			System.out.println("tabella inesistente");
		}

		System.out.println("8. cancello uno studente con matricola inesistente");
		try {
			System.out.println("Eliminato: " + d.rimuovi(555));
		} catch (MatricolaException e) {
			System.out.println(e.getMessage());
		} catch (TabellaInesistenteException e) {
			System.out.println("tabella inesistente");
		}
	}

}