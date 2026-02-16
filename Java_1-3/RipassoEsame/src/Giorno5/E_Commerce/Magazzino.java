package Giorno5.E_Commerce;

import java.util.HashMap;
import java.util.Map;

public class Magazzino {
    // Mappa: NOME PRODOTTO -> QUANTITÀ
    private Map<String, Integer> inventario = new HashMap<>();

    public void aggiungi(Prodotto p, int quantita) {
        String nome = p.getNome();
        
        if (inventario.containsKey(nome)) {
            int vecchi = inventario.get(nome);
            inventario.put(nome, vecchi + quantita);
        } else {
            inventario.put(nome, quantita);
        }
        System.out.println("📦 Stock aggiornato: " + nome + " -> " + inventario.get(nome) + " pz.");
    }
    
    // Metodo per controllare se c'è stock (serve al Main)
    public boolean controllaDisponibilita(String nomeProdotto) {
        if (inventario.containsKey(nomeProdotto)) {
            int quantita = inventario.get(nomeProdotto);
            return quantita > 0;
        }
        return false;
    }
    
    public void preleva(String nomeProdotto) {
        // Qui diamo per scontato che il controllo sia stato fatto prima
        int quantita = inventario.get(nomeProdotto);
        inventario.put(nomeProdotto, quantita - 1);
    }
}