package Giorno4.Festival;

public class Chitarrista extends Artista implements SuonabileDalVivo{
	public Chitarrista(String nome) {
		super(nome);
	}
	
	@Override
	public void esibisciti() throws Exception{
		System.out.println(getNome() + " Salta sul palco e attacca il jack!");
	}
	
	@Override
	public void faiAssolo() {
		System.out.println(getNome() + " fa un assolo alla Jimi Hendrix!");
	}

}
