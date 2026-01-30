package Giorno2.SmartHome;

public class Dispositivo {
	private String nome;
	private int consumo;
	
	public Dispositivo(String nome, int consumo) {
		this.nome = nome;
		this.setConsumo(consumo);
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getConsumo() {
		return consumo;
	}
	
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
	
	public void usa(int ore) {
		System.out.println("Nome: " + nome + " usato per ore: " + ore + " ore. Energia consumata: " + ore * consumo);
	}
}
