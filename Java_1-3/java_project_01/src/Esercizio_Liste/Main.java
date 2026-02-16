package Esercizio_Liste;

import Esercizi_Ereditarieta.Impiegato;

public class Main {
	public static void main(String[] args) {

		// --- TEST Azienda ---
		Azienda azienda = new Azienda();

		Impiegato emp1 = new Impiegato("Lorenzo", 1000, null);
		Impiegato emp2 = new Impiegato("Mario", 1200, null);

		azienda.assumi(emp1);
		azienda.assumi(emp2);

		System.out.println("Aumentiamo il salario di tutti di 200");
		azienda.incrementaSalarioPerTutti(200);

		try {
			azienda.licenzia(emp1);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		// --- TEST Pila ---
		Pila pila = new Pila();

		pila.add("Primo");
		pila.add("Secondo");
		pila.add("Terzo");

		System.out.println("Rimuovo elementi dalla pila:");
		try {
			System.out.println(pila.remove()); // Terzo
			System.out.println(pila.remove()); // Secondo
			System.out.println(pila.remove()); // Primo
			System.out.println(pila.remove()); // Eccezione: Pila Vuota
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
