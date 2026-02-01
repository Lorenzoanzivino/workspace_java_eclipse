package Giorno4.GarageDinamico;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		
		List<Auto> garage = new ArrayList<>();
		
		garage.add(new Auto("Fiat", 1200));
		garage.add(new Auto("Renault", 2000));
		garage.add(new Auto("Smart", 800));
		
		
		
		System.out.println("Auto: " + garage.size());
		
		for (Auto a : garage) {
			if (a.getCavalli() >= 2000) {
				System.out.println("Bolide: " + a.getModello());
			}else {
				System.out.println("Utilitaria: " + a.getModello());
			}
		}
		
	}
}
