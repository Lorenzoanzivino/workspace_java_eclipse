package Giorno1;

public class TestGiorno1 {

	public static void main(String[] args) {

		System.out.println("--- TEST PRODOTTO ---");
		// Creo Prodotto : TV da 500 euro
		ClasseBaseProdotto p = new ClasseBaseProdotto("TV Samsung", 500.0, "A123");
		ClasseBaseCliente c = new ClasseBaseCliente("Lorenzo", 500.0);
		// Sconto 10%
		p.sconto(10);
		// Output atteso : 450.0
		System.out.println("Prodotto: " + p.getNome() + " | Prezzo : " + p.getPrezzo());
		c.setNome("marco");
		System.out.println("Cambio nome da Lorenzo a " + c.getNome());
		c.acquista(p);

		System.out.println("--- TEST CONTO CORRENTE ---");
		ClasseBaseContoCorrente cc = new ClasseBaseContoCorrente("IT123", 10);
		cc.preleva(40);
		System.out.println("Saldo: " + cc.getSaldo());
		ClasseBaseBanca b = new ClasseBaseBanca("LAP", 100.0);
		b.erogaBonus(cc, 200.0);
		System.out.println("BANCA :" + b.getCassaforte());
		System.out.println("CC: " + cc.getSaldo());
		b.erogaBonus(cc, 50.0);
		System.out.println("BANCA :" + b.getCassaforte());
		System.out.println("CC: " + cc.getSaldo());
		b.incassaCommissione(cc);
		System.out.println("BANCA :" + b.getCassaforte());
		System.out.println("CC: " + cc.getSaldo());

		System.out.println("--- TEST STUDENTE ---");
		ClasseBaseStudente s = new ClasseBaseStudente("Lorenzo", "anzivino", 1234);
		s.stampaDettagli();
	}
}
