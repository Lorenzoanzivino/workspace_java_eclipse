package Giorno3.GrandHotelJava;

public class ReceptionMain {
    public static void main(String[] args) {
        
        // 1. Creo l'array eterogeneo (Polimorfismo)
        Stanza[] hotel = new Stanza[3];
        
        // 2. Riempio con stanze diverse
        // Camera 101: Standard, Pulita (Check-in OK)
        hotel[0] = new CameraStandard(101, true, 100);
        
        // Camera 202: Suite, Pulita (Check-in OK + Luci)
        hotel[1] = new SuitePresidenziale(202, true);
        
        // Camera 303: Standard, Sporca (Check-in ERRORE)
        hotel[2] = new CameraStandard(303, false, 100);
        
        // 3. Ciclo le stanze
        for (Stanza s : hotel) {
            System.out.println("\n--- Check-in Stanza " + s.getNumeroStanza() + " ---");
            
            try {
                // A. Provo a fare il check-in
                // Se è sporca, qui lancia l'eccezione e salta al CATCH
                s.effettuaCheckIn();
                
                // B. Controllo se ha la Domotica (Luci)
                // "s.accendiLuci()" qui darebbe errore! "s" non sa cosa sono le luci.
                if (s instanceof Domotica) {
                    // CASTING: "Tratta questa stanza come una Domotica"
                    Domotica d = (Domotica) s; 
                    d.accendiLuci();
                }
                
            } catch (Exception e) {
                // C. Gestisco l'errore (Stanza sporca)
                System.out.println("ERRORE: " + e.getMessage());
                System.out.println("-> Contattare impresa di pulizie!");
            }
        }
    }
}