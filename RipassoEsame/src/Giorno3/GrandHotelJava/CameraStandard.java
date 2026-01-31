package Giorno3.GrandHotelJava;

public class CameraStandard extends Stanza{
	private int costoFisso;
	
	public CameraStandard(int numeroStanza, boolean isPulita, int costoFisso) {
		super(numeroStanza, isPulita);
		this.costoFisso = costoFisso;
	}
	
	public int getCostoFisso() {
		return costoFisso;
	}

}
