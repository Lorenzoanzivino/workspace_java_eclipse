package Giorno1.DistributoreAutomatico;

public class Chiavetta {
	private String matricola; // es: "12345"
	private double credito; // es: 2.0

	public Chiavetta(String matricola, double credito) {
		this.setMatricola(matricola);
		this.setCredito(credito);
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		if (matricola == null) {
			System.out.println("Errore, inserisci una matricola");
			return;
		} else {
			this.matricola = matricola;
		}
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		if (credito < 0) {
			System.out.println("Credito insufficiente");
		} else {
			this.credito = credito;
		}
	}

	public void ricarica(double soldi) {
		credito += soldi;
	}
}
