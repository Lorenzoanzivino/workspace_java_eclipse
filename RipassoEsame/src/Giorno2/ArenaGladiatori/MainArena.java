package Giorno2.ArenaGladiatori;

public class MainArena {
	public static void main(String[] args) {
	Personaggio[] pr = new Personaggio[3];
	
	pr[0] = new Personaggio("Paesano", 100, 5);
	pr[1] = new Guerriero("Conan", 200, 10, 2);
	pr[2] = new Mago("Merlino", 80, 5, 25);
	
	
	for (Personaggio p : pr) {
		System.out.println("Nome: " + p.getNome() + " attacca: " + p.attacca());
	}
	pr[2].attacca();
	pr[2].attacca();
	pr[2].attacca();
	}
}
