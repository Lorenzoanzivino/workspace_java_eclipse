package Giorno2.Concessionario;

public class Moto extends Veicolo implements Noleggiabile{
	private boolean haBauletto;
	
	public Moto(String marca, int anno, boolean haBauletto) {
		super(marca, anno);
		this.haBauletto = haBauletto;
	}
	
	public boolean getHaBauletto() {
		return haBauletto;
	}
	
	@Override
	public void info() {
		// SENZA AGGIUNGERE NIENTE SOTTOINTENDO "TRUE"
		if (haBauletto) {
			System.out.println("Moto: " + getMarca() + " anno: " + getAnno() + " con Bauletto");
		}else {
			System.out.println("Moto: " + getMarca() + " anno: " + getAnno() + " senza Bauletto");
		}
	}

	@Override
	public double calcolaBollo() {
		// TODO Auto-generated method stub
		return 100.0;
	}
	
	@Override 
	public double calcolaCostoNoleggio(int giorni) {
		return 50.0 * giorni;
	}
}
