package Giorno5.E_Commerce;

import java.util.HashMap;
import java.util.Map;

public class Magazzino{
	
	public static void main(String[] args) {
		Map<Prodotto, Integer> magazzino = new HashMap<>();
		
		Prodotto telefono = new Mobile("iPhone", 999.9);
		Prodotto tv = new Mobile("Tv", 1200.9);
		Prodotto cuffie = new Elettronica("Cuffie", 30.9);
		Prodotto spazzolino = new Elettronica("Spazzolino", 22.9);
		
		magazzino.put(telefono, 10);
		magazzino.put(cuffie, 5);
		magazzino.put(tv, 8);
		magazzino.put(spazzolino, 12);
		
		System.out.println("Ci sono un totale di: " + magazzino.size());
		
		int quantita = 0;
		for (int qta : magazzino.values()) {
			quantita += qta;	
		}
		System.out.println("Totale quantità prodotti: " + quantita);
		
		for (Prodotto p : magazzino.keySet()) {
			System.out.println(p.getNome() + " : " + p.getPrezzo());
		}
		
	}
	
}
