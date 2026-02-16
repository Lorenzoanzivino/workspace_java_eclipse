package Giorno4.Festival;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Artista> scaletta = new ArrayList<>();
		
		scaletta.add(new Chitarrista("Slash"));
		scaletta.add(new Trapper("Sfera Ebbasta", true));
		scaletta.add(new Trapper("Ghali", false));
		
		System.out.println("Artisti: " + scaletta.size());
		
		for (Artista a : scaletta) {
			System.out.println("Sale sul palco: " + a.getNome());
			
			try {
				a.esibisciti();
				if (a instanceof SuonabileDalVivo) {
					((SuonabileDalVivo) a).faiAssolo();
				}
				
			}catch (Exception e) {
				System.out.println("FISCHI DAL PUBBLICO " + e.getMessage());
			}
		}
	}
}
