package Giorno5.E_Commerce;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    // Il carrello è una LISTA (Giorno 4)
    private List<Prodotto> carrello = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void aggiungiAlCarrello(Prodotto p) {
        carrello.add(p);
        System.out.println(nome + " ha aggiunto: " + p.getNome());
    }

    // Serve al Main per vedere cosa c'è dentro
    public List<Prodotto> getCarrello() {
        return carrello;
    }
}