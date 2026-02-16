package Giorno3.JavaFlix;

public abstract class Contenuto {
	private String titolo;
	
	public Contenuto(String titolo) {
		this.setTitolo(titolo);
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public abstract void riproduci() throws Exception;
}
