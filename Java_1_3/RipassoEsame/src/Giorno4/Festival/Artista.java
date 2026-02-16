package Giorno4.Festival;

public abstract class Artista {
	private String nome;
	public Artista(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public abstract void esibisciti() throws Exception;
}
