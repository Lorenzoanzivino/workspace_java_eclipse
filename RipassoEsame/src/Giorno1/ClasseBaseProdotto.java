package Giorno1;

public class ClasseBaseProdotto {
	private String nome;
	private double prezzo;
	private String codiceBarre;

	public ClasseBaseProdotto(String nome, double prezzo, String codiceBarre) {
		this.setNome(nome);
		this.setPrezzo(prezzo);
		this.setCodiceBarre(codiceBarre);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getCodiceBarre() {
		return codiceBarre;
	}

	public void setCodiceBarre(String codiceBarre) {
		this.codiceBarre = codiceBarre;
	}

	public void sconto(double percentuale) {
		this.prezzo -= (this.prezzo * percentuale / 100);
	}

}
