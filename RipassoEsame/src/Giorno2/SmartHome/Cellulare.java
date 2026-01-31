package Giorno2.SmartHome;

public class Cellulare extends Dispositivo{
	private int batteria; // 100
	
	public Cellulare(String nome, int consumo) {
		super(nome, consumo);
		this.batteria = 100;
	}
	
	public int getBatteria() {
		return batteria;
	}
	
	@Override
	public void usa(int ore) {
		int necessario = ore * getConsumo();
		if (batteria >= necessario) {
			batteria -= necessario;
			System.out.println(getNome() + " usato per " + ore + " ore. Batteria residua: " + batteria + " % ");
		}else {
			System.out.println("Non hai abbastanza energia");
		}
	}

}
