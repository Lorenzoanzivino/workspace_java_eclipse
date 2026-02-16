package Interfacce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import Esercizi_Ereditarieta.Impiegato;

public class Ordinamenti {

	public static void main(String[] args) {
		// Ordino lista di stringhe

		ArrayList<String> nomi = new ArrayList<>();

		nomi.add("romina");
		nomi.add("giulia");
		nomi.add("mario");
		nomi.add("aldo");

		Collections.sort(nomi);

		for (String string : nomi) {
			System.out.println(string);
		}

		Collections.sort(nomi, new StringComparator());

		for (String string : nomi) {
			System.out.println(string);
		}

		System.out.println("----------------------------------");

		// Ordino lista di Impiegati
		ArrayList<Impiegato> listaImp = new ArrayList<>();
		listaImp.add(new Impiegato("mario", 1500, new Date()));
		listaImp.add(new Impiegato("mario", 1500, new Date(120, 1, 1)));
		listaImp.add(new Impiegato("mario", 2500, new Date(110, 1, 1)));
		listaImp.add(new Impiegato("mario", 1200, new Date()));

		Collections.sort(listaImp);

		for (Impiegato impiegato : listaImp) {
			System.out.println(impiegato);
		}

		Collections.sort(listaImp, new ImpiegatoCompSalario());

		for (Impiegato impiegato : listaImp) {
			System.out.println(impiegato);
		}

	}

}
