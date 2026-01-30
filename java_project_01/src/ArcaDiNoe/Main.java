package ArcaDiNoe;

public class Main {

	public static void main(String[] args) {

		Arca arca = new Arca();

		arca.salva(new Cane());
		arca.salva(new Cane());
		arca.salva(new Cane()); // terzo → rifiutato

		arca.salva(new Gatto());
		arca.salva(new Canarino());
		arca.salva(new Airone());

		System.out.println("Totale animali: " + arca.getNumeroAnimali());

		System.out.println("\nCoro:");
		System.out.println(arca.coro());

		System.out.println("\nDettagli Arca:");
		System.out.println(arca);
	}
}
