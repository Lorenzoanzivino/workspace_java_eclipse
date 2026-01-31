package Giorno3.Pagamenti;

public class Main {
	public static void main(String[] args) {
		System.out.println("Tentativo 1:");
		CartaDiCredito c1 = new CartaDiCredito(100.0, "12345678");
		
		try {
			c1.eseguiTransazione();
			c1.stampaRicevuta();
		}catch (Exception e) {
			System.out.println("Qualcosa è andato storto: " + e.getMessage());
		}
		
		System.out.println("\nTentativo 2 (Errore):");
        // Caso 2: Importo a 0 (Deve fallire)
        CartaDiCredito c2 = new CartaDiCredito(0.0, "1234567812345678");
        
        try {
            c2.eseguiTransazione(); // Qui lancerà l'eccezione!
            c2.stampaRicevuta();    // Questa riga NON verrà mai eseguita se sopra fallisce
        } catch (Exception e) {
            System.out.println("ERRORE CATTURATO: " + e.getMessage());
        }
        
        System.out.println("\nTentativo 3:");
        // Caso 2: Importo a 0 (Deve fallire)
        CartaDiCredito c3 = new CartaDiCredito(100.0, "1234567812345678");
        
        try {
            c3.eseguiTransazione(); 
            c3.stampaRicevuta();    
        } catch (Exception e) {
            System.out.println("ERRORE CATTURATO: " + e.getMessage());
        }
	}

}
