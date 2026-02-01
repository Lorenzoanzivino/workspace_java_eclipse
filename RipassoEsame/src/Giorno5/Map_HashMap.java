package Giorno5;

import java.util.HashMap;
import java.util.Map;

public class Map_HashMap {
	public static void main(String[] args) {
		
		Map<String, String> credenziali = new HashMap<>();
		
		// Credenziali user e password - Inserire(put)
		credenziali.put("mario99", "pizza123");
		credenziali.put("luigi_bros", "fungo88");
		
		// Aggiorno password di mario99
		credenziali.put("mario99", "nuovaPassword");
		
		// esiste = nuovaPassword
		System.out.println(credenziali.get("luigi_bros"));
		
		// non esiste = null
		System.out.println(credenziali.get("Lorenzo"));
		
		// prima del .get vedere se esiste
		if(credenziali.containsKey("admin")) {
			System.out.println("admin presente!");
		}else {
			System.out.println("Nessun admin registrato.");
		}
	}
}
