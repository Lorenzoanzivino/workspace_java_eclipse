package Giorno1;

import java.util.Date;

public class ClasseBaseImpiegato {
	private String nome;
	private double salario;
	private Date dataAss;

	public ClasseBaseImpiegato(String nome, double salario, Date dataAss) {
		this.setNome(nome);
		this.setSalario(salario);
		this.setDataAss(dataAss);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getDataAss() {
		return dataAss;
	}

	public void setDataAss(Date dataAss) {
		this.dataAss = dataAss;
	}

	public void incrementoSalario(double aumento) {
		this.salario += aumento;

	}
}
