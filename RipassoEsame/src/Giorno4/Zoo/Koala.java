package Giorno4.Zoo;

public class Koala extends Animale{
	private boolean isSazio;
	
	public Koala(String nome, boolean isSazio) {
		super(nome);
		this.isSazio = isSazio;
	}
	
	public boolean getIsSazio() {
		return isSazio;
	}
	
	public void dorme() {
		System.out.println(getNome() + " Si è addormentato di botto...");
	}
	
	@Override
	public void mangia() throws Exception {
	    if (isSazio == true) {
	        // BOOM! Fermo tutto e lancio l'allarme al Main
	        throw new Exception(getNome() + " è già pieno e ti sputa le foglie!");
	    } 
	    
	    // Se arrivo qui, vuol dire che non è esploso
	    System.out.println(getNome() + " mastica piano piano l'eucalipto...");
	    dorme(); // Dorme solo se ha mangiato!
	}
	

}
