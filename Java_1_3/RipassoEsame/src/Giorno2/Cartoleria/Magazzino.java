package Giorno2.Cartoleria;

import java.util.ArrayList;
import java.util.List;

public class Magazzino {
	private List<Articoli> articoli;
	
	public Magazzino(){
		articoli = new ArrayList<>();
	}
	
	public void addArticoli(Articoli a) {
		articoli.add(a);
	}
	
	public void removeArticoli(Articoli a) {
		articoli.remove(a);
	}
	
	public void stampaArticoli() {
		for (Articoli a : articoli) {
			System.out.println(a);
		}
	}
	
	public double costoTotale() {
		double totale = 0;
		for (Articoli a : articoli) {
			totale += a.getCosto();
		}
		return totale;
	}
	
	public double ricavoTotale() {
		double totale = 0;
		for (Articoli a : articoli) {
			totale += a.getPrezzoVendita();
			}
			return totale;
	}
}
