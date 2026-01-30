package Giorno1.CinemaMultisala;

public class SalaCinema {
	private String titoloFilm;
	private double prezzoBiglietto;
	private int postiTotali;
	private int postiOccupati;
	private int etaMinima;

	public SalaCinema(String titoloFilm, double prezzoBiglietto, int postiTotali, int etaMinima) {
		this.titoloFilm = titoloFilm;
		this.setPrezzoBiglietto(prezzoBiglietto);
		this.setPostiTotali(postiTotali);
		this.setPostiOccupati(postiOccupati);
		this.setEtaMinima(etaMinima);
	}

	public String getTitoloFilm() {
		return titoloFilm;
	}

	public double getPrezzoBiglietto() {
		return prezzoBiglietto;
	}

	public void setPrezzoBiglietto(double prezzoBiglietto) {
		this.prezzoBiglietto = prezzoBiglietto;
	}

	public int getPostiTotali() {
		return postiTotali;
	}

	public void setPostiTotali(int postiTotali) {
		this.postiTotali = postiTotali;
	}

	public int getPostiOccupati() {
		return postiOccupati;
	}

	public void setPostiOccupati(int postiOccupati) {
		this.postiOccupati = postiOccupati;
	}

	public int getEtaMinima() {
		return etaMinima;
	}

	public void setEtaMinima(int etaMinima) {
		this.etaMinima = etaMinima;
	}

	public void venditaBiglietto(Spettatore s) {
		if (postiOccupati == postiTotali) {
			System.out.println("Sala Piena");
		} else if (s.getEta() < etaMinima) {
			System.out.println("Sei troppo piccolo");
		} else if (s.getPortafoglio() < prezzoBiglietto) {
			System.out.println("Prezzo isufficciente");
		} else {
			s.setPortafoglio(s.getPortafoglio() - prezzoBiglietto);
			postiOccupati++;
			System.out.println("Biglietto: " + getTitoloFilm() + " venduto a: " + s.getNome() + " posti rimasti: "
					+ getPostiTotali());
		}
	}

}
