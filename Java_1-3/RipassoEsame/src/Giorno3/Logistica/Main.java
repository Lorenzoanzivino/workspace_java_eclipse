package Giorno3.Logistica;

public class Main {
    public static void main (String[] args) {
        Collo[] collo = new Collo[3];
        collo[0] = new Busta("Mario Rossi", 0.5);
        collo[1] = new Scatola("Luigi Verdi", 10.0, 500.0);
        collo[2] = new Scatola("Gigante srl", 50.0, 1000.0); // Questo pesa 50kg!
        
        // "c" è il soggetto che cambia ad ogni giro (prima Busta, poi Scatola, etc.)
        for (Collo c : collo) {
            try {
                System.out.println("\n--- Analisi Collo di " + c.getMittente() + " ---");
                
                // CORREZIONE 1: Aggiungo il soggetto "c."
                double costo = c.getCostoSpedizione(); 
                System.out.println("Costo spedizione: " + costo + " euro");

                // CORREZIONE 2: Controllo interfaccia
                // Non posso fare c.calcolaRimborso() perché 'c' è un Collo generico.
                if (c instanceof Assicurabile) {
                    // CAST: "Fidati, trattalo come un Assicurabile"
                    Assicurabile a = (Assicurabile) c; 
                    System.out.println("Rimborso assicurato: " + a.calcolaRimborso() + " euro");
                }

            } catch(Exception e) {
                // Se c.getCostoSpedizione() lancia la bomba (peso > 30), atterriamo qui
                System.out.println("ERRORE SPEDIZIONE: " + e.getMessage());
            }
        }
    }
}