package Giorno3.Distributore;

public class Main {
	public static void main(String[] args) {
		
		Prodotto[] carrello = new Prodotto[3];
		
		carrello[0] = new Merendina("Fiesta", 1.0, false);
		carrello[1] = new Panino("Toast", 3.5, false);
		carrello[2] = new Merendina("Yogurt", 0.8, true);
		
		for (Prodotto p : carrello) {
			System.out.println("Provo a mangiare: " + p.getNome());
			
			try {
				if(p instanceof Scaldabile){
					((Scaldabile)p).riscalda();
				}
				p.consuma();
				
			}catch (Exception e) {
				System.out.println("ERRORE: " + e.getMessage() + " lo butto via!");
			}
		}
	}
}
