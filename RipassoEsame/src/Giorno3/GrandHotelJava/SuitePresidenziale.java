package Giorno3.GrandHotelJava;

// Corretto typo: Domodica -> Domotica
public class SuitePresidenziale extends Stanza implements Domotica { 
    
    public SuitePresidenziale(int numeroStanza, boolean isPulita) {
        super(numeroStanza, isPulita);    
    }
    
    @Override
    // CORREZIONE: Aggiunto "throws Exception"
    public void effettuaCheckIn() throws Exception {
        super.effettuaCheckIn(); // Ora se questo esplode, l'errore sale al Main
        System.out.println("Portare lo champagne!");
    }
    
    @Override
    public void accendiLuci() {
        System.out.println("Luci soffuse attivate col comando vocale.");
    }
}