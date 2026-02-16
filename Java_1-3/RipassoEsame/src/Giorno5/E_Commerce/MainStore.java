package Giorno5.E_Commerce;

public class MainStore {
    public static void main(String[] args) {
        
        // 1. Setup Magazzino
        Magazzino amazon = new Magazzino();
        Prodotto iphone = new Mobile("iPhone 15", 1200.0);
        amazon.aggiungi(iphone, 5); // Ne abbiamo 5
        
        // 2. Il Cliente vuole comprare
        System.out.println("\n--- CLIENTE ALLA CASSA ---");
        
        // Controllo disponibilità
        if (amazon.controllaDisponibilita("iPhone 15")) {
            System.out.println("Prodotto disponibile! Procedo al pagamento...");
            
            // 3. QUI DECIDO COME PAGARE
            // Creo un oggetto PagamentoRate usando il prezzo dell'iPhone
            Pagamento strategia = new PagamentoRate(iphone.getPrezzo(), 12);
            
            // Eseguo il pagamento
            strategia.paga();
            
            // Scarico dal magazzino
            amazon.preleva("iPhone 15");
            
        } else {
            System.out.println("Prodotto esaurito!");
        }
    }
}