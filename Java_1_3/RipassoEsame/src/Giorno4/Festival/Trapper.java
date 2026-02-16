package Giorno4.Festival;

public class Trapper extends Artista{
	private boolean usaAutotune;
	
	public Trapper(String nome, boolean usaAutotune) {
		super(nome);
		this.usaAutotune = usaAutotune;
	}
	
	public boolean getUsaAutotune() {
		return usaAutotune;
	}
	
	@Override
	public void esibisciti() throws Exception{
		if(usaAutotune == false ) {
			throw new Exception("Il microfono è rotto: " + super.getNome() + " non sa cantare senza autotune");
		}else {
			System.out.println(getNome() + " Skrrt Skrrt! Ehi Ehi! (Autotune a palla)");
		}
	}
}
