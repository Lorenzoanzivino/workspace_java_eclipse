/*
 * La Lista (Giorno 4):
 * Crea una List<Dispositivo> reteDomestica.
 * Aggiungi (.add):
 *     Una LampadinaSmart ("Luce Salotto", "Bianco").
 *     Una LampadinaSmart ("Luce Gaming", "RGB").
 *     Una TelecameraSicurezza ("Cam Ingresso", false).
 *     Una TelecameraSicurezza ("Cam Giardino", true) -> Questa deve esplodere.
 * La Mappa (Giorno 5 - Associazione):
 * Crea una Map<String, String> posizioni.
 * Mappa il Nome del Dispositivo (Chiave) alla Stanza (Valore).
 * Esempio (.put):
 *     "Luce Salotto" -> "Salotto"
 *     "Luce Gaming" -> "Camera da Letto"
 *     "Cam Ingresso" -> "Ingresso Principale"
 *     "Cam Giardino" -> "Esterno"
 * Il Ciclo Principale (Giorno 4 - For-Each):
 * Scorri la lista: for (Dispositivo d : reteDomestica).
 * La Logica Completa (Dentro il ciclo):
 * Step A (Mappa): Scopri dove si trova il dispositivo.
 *     Usa d.getNome() per cercare nella Mappa (posizioni.get(...)).
 *     Stampa: "\n--- Attivo [Nome] situato in: [Stanza] ---".
 * Step B (Interfaccia - Giorno 3):
 *     Controlla se è un oggetto Connessione (instanceof).
 *     Se sì, fai il cast e chiama connettiWiFi().
 * Step C (Eccezioni - Giorno 3):
 *     Apri un try-catch.
 *     Chiama d.eseguiAzione().
 *     Nel catch: Cattura l'errore della telecamera guasta e stampa "ALLARME: " + messaggio errore.
 */

package Giorno6.JARVIS_SmartHome;

public class JarvisMain {

}
