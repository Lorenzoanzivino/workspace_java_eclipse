package Giorno4.Zoo;

public class Tigre extends Animale{
	public Tigre(String nome) {
		super(nome);
	}
	
	@Override 
	public void mangia() throws Exception{
		System.out.println(getNome() + " Mangia una bistecca gigante... ROAR!");
	}

}
