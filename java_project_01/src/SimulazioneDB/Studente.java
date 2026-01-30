package SimulazioneDB;

import java.io.Serializable;
import java.util.Date;

public class Studente implements Serializable {

	private static final long serialVersionUID = 1L;

	private int matricola;
	private String nome;
	private String corsoLaurea;
	private Date dataImmatricolazione;

	public Studente(int matricola, String nome, String corsoLaurea, Date dataImmatricolazione) {
		this.matricola = matricola;
		this.nome = nome;
		this.corsoLaurea = corsoLaurea;
		this.dataImmatricolazione = dataImmatricolazione;
	}

	/* ===================== GETTER ===================== */

	public int getMatricola() {
		return matricola;
	}

	public String getNome() {
		return nome;
	}

	public String getCorsoLaurea() {
		return corsoLaurea;
	}

	public Date getDataImmatricolazione() {
		return dataImmatricolazione;
	}

	/* ===================== SETTER ===================== */

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCorsoLaurea(String corsoLaurea) {
		this.corsoLaurea = corsoLaurea;
	}

	public void setDataImmatricolazione(Date dataImmatricolazione) {
		this.dataImmatricolazione = dataImmatricolazione;
	}

	/* ===================== TO STRING ===================== */

	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + ", nome=" + nome + ", corsoLaurea=" + corsoLaurea
				+ ", dataImmatricolazione=" + dataImmatricolazione + "]";
	}
}
