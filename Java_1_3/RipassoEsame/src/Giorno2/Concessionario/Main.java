package Giorno2.Concessionario;

public class Main {
	public static void main(String[] args) {
		
		// --- PARTE 1: IL GARAGE (Ereditarietà + Classi Astratte) ---
		Veicolo[] garage = new Veicolo[3];
		
		garage[0] = new Auto("Fiat", 2020, 5);
		garage[1] = new Moto("Yamaha", 2019, true);
		garage[2] = new Moto("Ducati", 2018, false);
		
		System.out.println("--- GARAGE ---");
		for (Veicolo v : garage) {
			v.info(); // Polimorfismo: chiama il metodo giusto di Auto o Moto
			System.out.println("Tassa da pagare: " + v.calcolaBollo() + " euro");
		}
		
		// PARTE 2: IL NOLEGGIO (interfacce)
		System.out.println("\n--- PREVENTIVI NOLEGGIO (3 GIORNI) ---");
		
		Noleggiabile[] flotta = new Noleggiabile[3];
		flotta[0] = new Auto("Fiat Panda", 2021, 5);
		flotta[1] = new Moto("Vespa", 2023, false);
		flotta[2] = new Moto("MotoGen", 2011, true);
		
		for (Noleggiabile n : flotta) {
			
			double costo = n.calcolaCostoNoleggio(3);
			System.out.println("Costo noleggio: " + costo + " euro");
			
			// Casting: Se è un veicolo, stampo la marca
		    if (n instanceof Veicolo) {
		        Veicolo v = (Veicolo) n; 
		        System.out.println("...per il veicolo: " + v.getMarca());
		    }
		} 
		
	} 

}