package Giorno3.JavaFlix;

public class MainFlix {
	public static void main (String[] args) {
		
		Contenuto[] playlist = new Contenuto[3];
		
		playlist[0] = new Film("Il Gladiatore");
		playlist[1] = new DirettaLive("Finale mondiali", false);
		playlist[2] = new DirettaLive("TG Ieri", true);
		
		for (Contenuto c : playlist) {
			System.out.println("Titolo: " + c.getTitolo());
			try{
				c.riproduci();
				if (c instanceof Scaricabile) {
					((Scaricabile)c).download();
				}
			}catch (Exception e) {
				System.out.println("Errore" + e.getMessage());
			}
				
		}
	}
}
