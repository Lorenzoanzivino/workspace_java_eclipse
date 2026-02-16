package Giorno4.Zoo;

public class Delfino extends Animale implements Addestrabile{
	public Delfino(String nome) {
		super(nome);
		
	}
	
	@Override
	public void mangia() throws Exception{
		System.out.println(getNome() + " Ingoia dei pesciolini");
	}
	
	@Override
	public void eseguiTrick() {
		System.out.println(getNome() + " Salta nel cerchio di fuoco... splash!");
	}
}
