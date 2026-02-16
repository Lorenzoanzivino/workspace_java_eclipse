/*
 * Crea la classe astratta Dispositivo:
 * Attributi (Giorno 1): private String nome.
 * Costruttore (Giorno 1): Inizializza il nome.
 * Getter (Giorno 1): Per il nome.
 * Metodo Astratto (Giorno 3): 
 * public abstract void eseguiAzione() throws Exception;
 * Nota: Dichiariamo che un'azione può fallire 
 * (es. lampadina bruciata).
*/

package Giorno6.JARVIS_SmartHome;

public abstract class Dispositivo {
	private String nome;
	
	public Dispositivo(String nome) {
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public abstract void eseguiAzione() throws Exception;
}
