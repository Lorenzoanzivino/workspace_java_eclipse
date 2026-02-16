/*
 * Attributi: private String colore.
 * Costruttore: Chiama super(nome) e setta il colore.
 * Override connettiWiFi(): 
 * Stampa "[Nome] connessa al WiFi.".
 * Override eseguiAzione():
 * Stampa: "La lampadina si accende di colore [colore]!".
 */

package Giorno6.JARVIS_SmartHome;

public class LampadinaSmart extends DispositivoSmart{
	private String colore;
	
	public LampadinaSmart(String nome, String colore) {
		super(nome);
		this.setColore(colore);
	}
	
	public String getColore() {
		return colore;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	@Override //Classe Astratta Dispositivo
	public void eseguiAzione() throws Exception{
		verificaConnessione();
			System.out.println(getNome() + " si accende con colore: " + colore);
		}

}
