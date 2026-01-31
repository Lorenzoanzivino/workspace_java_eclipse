package Giorno3.JavaFlix;

public class Film extends Contenuto implements Scaricabile{
	public Film(String titolo) {
		super(titolo);
	}
	
	@Override
	public void riproduci() {
		System.out.println("Inizio riproduzione film: " + getTitolo());
	}
	
	@Override
	public void download() {
		System.out.println("Sto scaricando: " + getTitolo() + " nella memoria...");
	}
}
