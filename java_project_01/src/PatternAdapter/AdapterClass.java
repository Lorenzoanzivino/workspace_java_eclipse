package PatternAdapter;

public class AdapterClass extends PaymentSystem implements PaymentProcessor {

	@Override
	public void pay(double amount) {
		// Conversione da euro a centesimi (int)
		int amountInCents = (int) (amount * 100);
		// Chiamo il metodo della classe padre
		makePayment(amountInCents);

	}

}
