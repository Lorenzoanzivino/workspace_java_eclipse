package Giorno2.SmartHome;

public class Console extends Dispositivo{
	public Console(String nome, int consumo) {
		super(nome, consumo);
	}
	
	@Override
	public void usa(int ore) {
		super.usa(ore);
		System.out.println("Sto giocando a Fifa!");
	}

}
