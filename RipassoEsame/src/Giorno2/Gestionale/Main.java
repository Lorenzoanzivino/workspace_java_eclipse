package Giorno2.Gestionale;

public class Main {
	public static void main(String[] args) {
		
		Dipendente[] staff = new Dipendente[4];
		staff[0] = new Dipendente("Segretaria", 1200.0);
		staff[1] = new Sviluppatore("Dev Senior", 1500.0, 300.0);
		// Manager Senior: 12 persone (>10) -> Bonus team + Bonus stress!
		staff[2] = new Manager("Project manager senior", 2000.0, 12);
		// Manager Junior: 5 persone -> Solo bonus team
		staff[3] = new Manager("Project manager junior", 2000.0, 5);
		
		// CORREZIONE 1: Dichiara il tipo double
		double totaleAzienda = 0;
		
		// CORREZIONE 2: 'for' minuscolo e aggiungi la variabile 'd'
		for (Dipendente d : staff) {
			
			// CORREZIONE 3 (FONDAMENTALE):
			// Non chiamare getStipendioBase(), altrimenti perdi i bonus!
			// Chiama calcolaStipendio() per attivare il Polimorfismo.
			double stipendioReale = d.calcolaStipendio();
			
			System.out.println("Nome: " + d.getNome() + " | Stipendio: " + stipendioReale);
			
			totaleAzienda += stipendioReale;
		}
		
		// CORREZIONE 4: Mancava il '+' di concatenazione
		System.out.println("--------------------------------");
		System.out.println("Costo totale Dipendenti: " + totaleAzienda);
	}
}