package Giorno4;

import java.util.ArrayList;
import java.util.List;

public class Liste_ArrayList {
	public Liste_ArrayList() {
	
	List<String> invitati = new ArrayList<>();
	
	invitati.add("Lorenzo");
	invitati.add("Marco");
	invitati.add("Simona");
	
	System.out.println("Ci sono " + invitati.size() + " invitati");
	
	for (String nome : invitati) {
		System.out.println(nome);
		}
	
	invitati.remove(1);
	
	for (String nome : invitati) {
		System.out.println(nome);
		}
	}
}
