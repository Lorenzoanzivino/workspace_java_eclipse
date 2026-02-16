package IlTraffico;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UtilityAutomobili {

	public static void main(String[] args) {

		ArrayList<Automobile> parcheggio = new ArrayList<>();
		parcheggio.add(new Automobile("Fiat", "Panda", "GM033ER"));
		parcheggio.add(new Automobile("Tesla", "Model 3", "AA111BB"));
		parcheggio.add(new Automobile("Ford", "Focus", "CC222DD"));
		parcheggio.add(new Automobile("Fiat", "500", "EE333FF"));

		// 1) Circolano solo le auto di marca Fiat
		List<Automobile> soloFiat = filtraAutomobile(parcheggio, auto -> auto.getMarca().equals("Fiat"));
		System.out.println("Auto di marca Fiat:");
		soloFiat.forEach(auto -> System.out.println(auto));

		// 2) Circolano solo le auto con targhe pari
		List<Automobile> targhePari = filtraAutomobile(parcheggio, auto -> {
			char ultimo = auto.getTarga().charAt(auto.getTarga().length() - 3);
			if (Character.isDigit(ultimo)) {
				return (ultimo - '0') % 2 == 0;
			}
			return false; // ignora se l'ultimo carattere non è un numero
		});
		System.out.println("\nAuto con targhe pari:");
		targhePari.forEach(auto -> System.out.println(auto));

		// 3) Circolano solo le auto con targhe dispari
		List<Automobile> targheDispari = filtraAutomobile(parcheggio, auto -> {
			char ultimo = auto.getTarga().charAt(auto.getTarga().length() - 3);
			if (Character.isDigit(ultimo)) {
				return (ultimo - '0') % 2 != 0;
			}
			return false; // ignora se l'ultimo carattere non è un numero
		});
		System.out.println("\nAuto con targhe dispari:");
		targheDispari.forEach(System.out::println);
	}

	// Metodo statico che filtra le automobili
	public static List<Automobile> filtraAutomobile(List<Automobile> lista, Predicate<Automobile> criterio) {
		List<Automobile> filtrate = new ArrayList<>();
		for (Automobile auto : lista) {
			if (criterio.test(auto)) {
				filtrate.add(auto);
			}
		}
		return filtrate;
	}

}
