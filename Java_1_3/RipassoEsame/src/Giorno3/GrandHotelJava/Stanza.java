package Giorno3.GrandHotelJava;

public abstract class Stanza {
	private int numeroStanza;
	private boolean isPulita;
	
	public Stanza(int numeroStanza, boolean isPulita) {
		this.numeroStanza = numeroStanza;
		this.isPulita = isPulita;
	}
	
	public int getNumeroStanza() {
		return numeroStanza;
	}
	
	public void effettuaCheckIn() throws Exception {
		if (isPulita == false){
			throw new Exception("Impossibile: Stanza: " + numeroStanza + " sporca!");
		}
		System.out.println("Benvenuto");
	}

}
