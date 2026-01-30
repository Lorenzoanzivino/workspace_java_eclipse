package Giorno1.CinemaMultisala;

public class Spettatore {
	private String nome;
	private int eta;
	private double portafoglio;

	public Spettatore(String nome, int eta, double portafoglio) {
		this.nome = nome;
		this.setEta(eta);
		this.setPortafoglio(portafoglio);
	}

	public String getNome() {
		return nome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		if (eta < 0) {
			System.out.println("Errore");
		} else {
			this.eta = eta;
		}
	}

	public double getPortafoglio() {
		return portafoglio;
	}

	public void setPortafoglio(double portafoglio) {
		this.portafoglio = portafoglio;
	}
}
