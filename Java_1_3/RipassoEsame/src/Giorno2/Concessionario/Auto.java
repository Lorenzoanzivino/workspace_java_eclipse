package Giorno2.Concessionario;

public class Auto extends Veicolo implements Noleggiabile{
	private int porte;
	
	public Auto(String marca, int anno, int porte) {
		super(marca, anno);
		this.porte = porte;
	}
	
	public int getPorte() {
		return porte;
	}
	
	@Override
	public void info() {
		System.out.println("Auto: " + getMarca() + " anno: " + getAnno() + " porte: " + porte);
		
	}

	@Override
	public double calcolaBollo() {
		// TODO Auto-generated method stub
		return 50.0 + (10.0 * porte);
	}
	
	@Override 
	public double calcolaCostoNoleggio(int giorni) {
		return 50.0 * giorni;
	}

}
