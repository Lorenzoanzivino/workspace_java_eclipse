package Giorno1;

public class ClasseBaseContoCorrente {
	private String iban;
	private double saldo;

	public ClasseBaseContoCorrente(String iban, double saldo) {
		this.setIban(iban);
		this.setSaldo(saldo);
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void preleva(double importo) {
		if (importo > saldo) {
			System.out.println("errore, il saldo è inferiore a " + importo);
		} else if (importo == saldo) {
			System.out.println("Non puoi portare il saldo a 0");
		} else {
			this.saldo -= importo;
		}
	}

}
