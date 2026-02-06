package Giorno6.JARVIS_SmartHome;

public abstract class DispositivoSmart extends Dispositivo implements Connessione{
	private boolean isOffline;
	
	public DispositivoSmart(String nome) {
		super(nome);
		this.isOffline = true;
	}
	
	
	public void verificaConnessione() throws Exception{
		if(isOffline) {
			throw new Exception("ERRORE... " + getNome() + " non è connessa");
		}
	}
	
	@Override // Interfaccia Connessione
	public void connettiWifi() {
		isOffline = false;
		System.out.println(getNome() + " Connessa al WiFi...");
	}

}
