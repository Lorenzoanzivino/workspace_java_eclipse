package Giorno5.E_Commerce;

public class PagamentoRate implements Pagamento {
    private double importoTotale;
    private int numeroRate;

    public PagamentoRate(double importoTotale, int numeroRate) {
        this.importoTotale = importoTotale;
        this.numeroRate = numeroRate;
    }

    @Override
    public void paga() {
    	if (numeroRate > 0) {
    		double rataSingola = importoTotale/numeroRate;
            System.out.println("💳 Pagamento accettato: " + numeroRate + " rate da " + rataSingola + "€");   		
    	}else {
    		System.out.println("ERRORE");
    	}

    }
}
