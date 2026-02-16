package Giorno3.Pagamenti;

public class CartaDiCredito extends Pagamento implements Stampabile{
	private String numeroCarta;
	
	public CartaDiCredito(double importo, String numeroCarta) {
		super(importo);
		this.numeroCarta = numeroCarta;
	}
	
	public String getNumeroCarta() {
		return numeroCarta;
	}
	
	@Override
	public void eseguiTransazione() throws Exception{
		if (getImporto() <= 0) {
			throw new Exception("errore: importo non valido");
			
		}
		System.out.println("Pagamento di " + getImporto() + " effettuato con carta: " + numeroCarta);
	}
	
	@Override
	public void stampaRicevuta() {
		System.out.println("--- RICEVUTA CARTASI ---");
		System.out.println("Importo: " + getImporto() + " | Carta: ****" + numeroCarta.substring(12));
		System.out.println("------------------------");
	}
}
