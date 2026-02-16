package Giorno3.Pagamenti;

public abstract class Pagamento {
	private double importo;
	
	public Pagamento(double importo) {
		this.importo = importo;
	}
	
	public double getImporto() {
		return importo;
	}
	
	public abstract void eseguiTransazione() throws Exception;
	
}
