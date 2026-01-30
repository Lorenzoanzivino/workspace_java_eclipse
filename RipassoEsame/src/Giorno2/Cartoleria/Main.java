package Giorno2.Cartoleria;

public class Main {
	public static void main(String[] args) {
		Magazzino m = new Magazzino();

		Penna p1 = new Penna("Bic", "Stilo", 0.50, 0, "Blu");
		Gomma g1 = new Gomma("Staedtler", "Mars", 0.80, 5.0, 0, "Rettangolare");

		m.addArticoli(p1);
		m.addArticoli(g1);

		m.stampaArticoli();
		System.out.println("Costo totale: " + m.costoTotale());
		System.out.println("Ricavo totale: " + m.ricavoTotale());

		m.removeArticoli(g1);
		System.out.println("Dopo rimozione:");
		System.out.println("Costo totale: " + m.costoTotale());
		System.out.println("Ricavo totale: " + m.ricavoTotale());
	}

}
