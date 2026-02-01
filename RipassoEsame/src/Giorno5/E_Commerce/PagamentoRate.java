package Giorno5.E_Commerce;

public class PagamentoRate implements Pagamento {
    private double importo;
    private int rate;

    public PagamentoRate(double importo, int rate) {
        this.importo = importo;
        this.rate = rate;
    }

    @Override
    public void paga() {
    	if (rate > 0) {
            System.out.println("Pagamento in " + rate + " rate da " + (importo / rate) + " ciascuna");   		
    	}else {
    		System.out.println("ERRORE");
    	}

    }
}
