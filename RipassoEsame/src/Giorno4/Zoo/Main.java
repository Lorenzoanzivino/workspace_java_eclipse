package Giorno4.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Animale> recinto = new ArrayList<>();
		
		recinto.add(new Tigre("Luce"));
		recinto.add(new Delfino("Flipper"));
		recinto.add(new Koala("Sid", true));
		recinto.add(new Koala("Lillo", false));
		
		System.out.println("nel recinto ci sono: " + recinto.size() + " animali");
		
		for (Animale a : recinto) {
			System.out.println("Mi avvicino a: " + a.getNome());
			
			try {
				a.mangia();
				if(a instanceof Addestrabile) {
					((Addestrabile)a).eseguiTrick();
				}
			}catch (Exception e) {
				System.out.println("ERRORE " + e.getMessage());
			}
		}
	}
}
