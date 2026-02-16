package Giorno1;

public class ClasseBaseCliente {
	private String nome;
	private double budget;

	public ClasseBaseCliente(String nome, double budget) {
		this.setNome(nome);
		this.setBudget(budget);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double budget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public void acquista(ClasseBaseProdotto p) {
		if (budget >= p.getPrezzo()) {
			budget -= p.getPrezzo();
			System.out.println("Acquisto effettuato! hai comprato " + p.getNome() + " budget residuo : " + budget);
		} else {
			System.out.println("Fondi insufficienti per comprare " + p.getNome());
		}
	}
}
