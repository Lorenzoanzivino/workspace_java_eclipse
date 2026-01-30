package Contest;

public class Performer {
	private String nome;
	private int voti;

	public Performer(String nome) {
		this.nome = nome;
		this.voti = 0;
	}

	public String getNome() {
		return nome;
	}

	public int getVoti() {
		return voti;
	}

	public void incrementaVoti() {
		voti++;
	}

	@Override
	public String toString() {
		return nome + "(" + voti + "voti)";
	}
}
