package Giorno2.ArenaGladiatori;

public class Personaggio {
	private String nome;
	private int puntiVita;
	private int attaccoBase;
	
	public Personaggio(String nome, int puntiVita, int attaccoBase) {
		this.nome = nome;
		this.setPuntiVita(puntiVita);
		this.setAttaccoBase(attaccoBase);
	}

	public String getNome() {
		return nome;
	}
	
	public int getPuntiVita() {
		return puntiVita;
	}
	public void setPuntiVita(int puntiVita) {
		this.puntiVita = puntiVita;
	}
	
	public int getAttaccoBase() {
		return attaccoBase;
	}
	
	public void setAttaccoBase(int attaccoBase) {
		this.attaccoBase = attaccoBase;
	}
	
	public int subisciDanno(int danno) {
		return puntiVita -= danno;
	}

	public int attacca() {
		return attaccoBase;
	}
}
