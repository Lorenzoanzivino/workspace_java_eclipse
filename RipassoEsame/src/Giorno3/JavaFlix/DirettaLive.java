package Giorno3.JavaFlix;

public class DirettaLive extends Contenuto{
	private boolean isConclusa;
	public DirettaLive(String titolo, boolean isConclusa) {
		super(titolo);
		this.isConclusa = isConclusa;
	}
	
	@Override
	public void riproduci() throws Exception{
		if (isConclusa == true) {
			throw new Exception("L'evento è terminato! Non disponibile");
		}else {
			System.out.println("Sei in diretta streaming su: " + getTitolo());
		}
	}

}
