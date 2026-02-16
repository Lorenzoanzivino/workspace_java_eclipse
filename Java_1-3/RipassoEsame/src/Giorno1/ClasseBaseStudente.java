package Giorno1;

public class ClasseBaseStudente {
	private String nome;
	private String cognome;
	private int matricola;

	public ClasseBaseStudente(String nome, String cognome, int matricola) {
		this.setNome(nome);
		this.setCognome(cognome);
		this.setMatricola(matricola);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public void stampaDettagli() {
		System.out.println("Lo studente nome: " + nome + " cognome: " + cognome + " ha matricola: " + matricola);
	}
}
