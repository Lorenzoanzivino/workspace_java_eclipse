package Giorno5.EsercizioMap;

import java.util.HashMap;
import java.util.Map;

public class Main_2 {
	public static void main(String[] args) {
		
		Map<String, Integer> voti = new HashMap<>();
		
		voti.put("Mario", 0);
		voti.put("Luigi", 0);
		
		int v = voti.get("Mario");
		v ++;
		voti.put("Mario", v);
		
		voti.put("Luigi", voti.get("Luigi") + 50);
		
		System.out.println("Mario ha: " + voti.get("Mario") + " voti");
		System.out.println("Luigi ha: " + voti.get("Luigi") + " voti");
	}
}
