package Giorno1.DistributoreAutomatico;

public class Distributore {
	private double prezzoCaffe;
	private double incassoTotale;

	// CORREZIONE: Tolto incassoTotale dal costruttore. Una macchinetta nuova parte
	// sempre da 0!
	public Distributore(double prezzoCaffe) {
		this.prezzoCaffe = prezzoCaffe;
		this.incassoTotale = 0.0;
	}

	public double getIncassoTotale() {
		return incassoTotale;
	}

	// Non serve il setIncassoTotale, nessuno deve poter truccare i conti da fuori!

	public void erogaCaffe(Chiavetta c) {
		// CORREZIONE: Controllo se il credito copre il PREZZO, non solo se è > 0
		if (c.getCredito() >= prezzoCaffe) {

			// 1. Tolgo soldi al cliente
			c.setCredito(c.getCredito() - prezzoCaffe);

			// 2. CORREZIONE: Aggiungo soldi alla macchinetta
			this.incassoTotale += prezzoCaffe;

			System.out.println(
					"Caffe erogato a matricola: " + c.getMatricola() + " | Credito residuo: " + c.getCredito());
		} else {
			System.out.println("Credito insufficiente per la matricola " + c.getMatricola());
		}
	}
}