package ArcaDiNoe;

import java.util.ArrayList;

public class Arca {

	private ArrayList<Animale> animali = new ArrayList<>();

	public void salva(Animale a) {

		// OPZIONALE: massimo due esemplari per specie
		long count = animali.stream().filter(x -> x.getClass().equals(a.getClass())).count();

		if (count >= 2) {
			System.out.println("Non posso salvare più di 2 " + a.getClass().getSimpleName());
			return;
		}

		animali.add(a);
	}

	public int getNumeroAnimali() {
		return animali.size();
	}

	public String coro() {
		StringBuilder sb = new StringBuilder();
		for (Animale a : animali) {
			sb.append(a.verso()).append(" ");
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Animale a : animali) {
			sb.append(a.toString()).append("\n");
		}
		return sb.toString();
	}
}