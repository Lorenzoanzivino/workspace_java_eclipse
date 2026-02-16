package Giorno1;

public class ClasseBaseBanca {
	private String nomeFiliale;
	private double cassaforte;

	public ClasseBaseBanca(String nomeFiliale, double cassaforte) {
		this.setNomeFiliale(nomeFiliale);
		this.setCassaforte(cassaforte);
	}

	public String getNomeFiliale() {
		return nomeFiliale;
	}

	public void setNomeFiliale(String nomeFiliale) {
		this.nomeFiliale = nomeFiliale;
	}

	public double getCassaforte() {
		return cassaforte;
	}

	public void setCassaforte(double cassaforte) {
		this.cassaforte = cassaforte;
	}

	public void erogaBonus(ClasseBaseContoCorrente cc, double importo) {
		if (cassaforte >= importo) {
			cassaforte -= importo;
			cc.setSaldo(cc.getSaldo() + importo);
		} else {
			System.out.println("La banca non ha fondi sufficienti");
		}
	}

	public void incassaCommissione(ClasseBaseContoCorrente cc) {
		if (cc.getSaldo() >= 2.0) {
			cc.setSaldo(cc.getSaldo() - 2.0);
			cassaforte += 2.0;
			System.out.println("Commissione incassata");
		} else {
			System.out.println("Cliente: " + cc.getIban() + " al verde, impossibile incassare");
		}
	}

}
