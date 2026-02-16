package Giorno3.Logistica;

public class Scatola extends Collo implements Assicurabile{
	private double valoreContenuto;
	
	public Scatola(String mittente, double peso, double valoreContenuto) {
		super(mittente, peso);
		this.setValoreContenuto(valoreContenuto);
	}
	
	public double getValoreContenuto() {
		return valoreContenuto;
	}
	public void setValoreContenuto(double valoreContenuto) {
		this.valoreContenuto = valoreContenuto;
	}
	
	double costo = getPeso() + 1.5;
	@Override
	public double getCostoSpedizione() throws Exception{
		if (getPeso() > 30.0) {
			throw new Exception("Collo troppo pesante! Serve un corriere speciale");
		}
		return costo;
	}
	
	@Override
	public double calcolaRimborso() {
		return valoreContenuto;
	}

}
