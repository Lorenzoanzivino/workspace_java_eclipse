package Giorno4.Zoo;

public abstract class Animale {
	private String nome;
	
	public Animale(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public abstract void mangia() throws Exception;
}
