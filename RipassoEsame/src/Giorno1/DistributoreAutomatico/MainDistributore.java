package Giorno1.DistributoreAutomatico;

public class MainDistributore {

	// CORREZIONE: static void main per far partire il programma
	public static void main(String[] args) {

		System.out.println("--- INIZIO TEST ---");

		// 1. Creo chiavetta con 0.30 (Troppo poco per un caffè da 0.50)
		Chiavetta c = new Chiavetta("LORENZO", 0.30);

		// 2. Creo distributore (Caffè a 0.50)
		Distributore d = new Distributore(0.50);

		// 3. Provo a prendere caffè (Deve fallire)
		d.erogaCaffe(c);

		// 4. Ricarico 1.00 euro (Totale ora: 1.30)
		System.out.println("--- RICARICA ---");
		c.ricarica(1.00);

		// 5. Prendo caffè 1 (Ok. Resto: 0.80)
		d.erogaCaffe(c);

		// 6. Prendo caffè 2 (Ok. Resto: 0.30)
		d.erogaCaffe(c);

		// 7. Prendo caffè 3 (Deve fallire. Ho 0.30, serve 0.50)
		d.erogaCaffe(c);

		System.out.println("--- CHIUSURA GIORNATA ---");
		// Deve essere 1.00 (Due caffè venduti)
		System.out.println("Incasso della giornata: " + d.getIncassoTotale());
	}
}