/*
 * Attributi: private boolean isOffline 
 * (simula un guasto).
 * Costruttore: Chiama super e inizializza isOffline.
 * Override eseguiAzione() (Giorno 3 - Eccezioni):
 * SE isOffline è true -> LANCIA ECCEZIONE: 
 * "ERRORE CRITICO: 
 * Telecamera [Nome] manomessa o scollegata!".
 * ALTRIMENTI -> Stampa: "Registrazione in corso...".
 */

package Giorno6.JARVIS_SmartHome;

public class TelecameraSicurezza extends DispositivoSmart{
	
	public TelecameraSicurezza(String nome) {
		super(nome);
	}
	
	@Override //Classe Astratta Dispositivo
	public void eseguiAzione() throws Exception{
		verificaConnessione();
			System.out.println(getNome() + " Manomessa o scollegata!");
		}
}
