package Giorno5.EsercizioMap;

import java.util.HashMap;
import java.util.Map;

public class Main_1 {
	public static void main(String [] args) {
		
		Map<String, String> dizionario = new HashMap<>();
		
		dizionario.put("Gatto", "Cat");
		dizionario.put("Cane", "Dog");
		dizionario.put("Libro", "Book");
		dizionario.put("Mela", "Apple");
		
		for (String chiave : dizionario.keySet()) {
			String valore = dizionario.get(chiave);
			
			System.out.println(chiave + " si traduce in " + valore);
		}
	}

}
