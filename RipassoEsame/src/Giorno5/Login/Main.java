package Giorno5.Login;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		
		Map<String, String> databaseUtenti = new HashMap<>();
		
		databaseUtenti.put("user1", "pass1");
		databaseUtenti.put("user2", "pass2");
		databaseUtenti.put("admin", "root");
		
		System.out.println(databaseUtenti.get("user1"));
		System.out.println(databaseUtenti.get("Lorenzo"));
		
		// Simuliamo l'input dell'utente
		String utenteInserito = "admin";
		String passwordInserita = "12345"; // Sbagliata apposta (quella vera è "root")

		System.out.println("\n--- TENTATIVO DI LOGIN ---");

		// 1. Controllo se l'utente esiste (Hai la chiave?)
		if (databaseUtenti.containsKey(utenteInserito)) {
		    
		    // 2. Recupero la password VERA dal database (Apro l'armadietto)
		    String passwordVera = databaseUtenti.get(utenteInserito);
		    
		    // 3. Confronto le due password
		    if (passwordVera.equals(passwordInserita)) {
		        System.out.println("✅ Accesso Consentito! Benvenuto " + utenteInserito);
		    } else {
		        System.out.println("❌ Errore: Password errata!");
		    }

		} else {
		    // L'utente non c'è proprio
		    System.out.println("❌ Errore: Utente non trovato.");
		}
	}
}
