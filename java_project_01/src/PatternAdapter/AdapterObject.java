package PatternAdapter;

public class AdapterObject implements PaymentProcessor {

	private PaymentSystem paymentSystem;

	public AdapterObject(PaymentSystem paymentSystem) {
		this.paymentSystem = paymentSystem;
	}

	@Override
	public void pay(double amount) {
		int amountInCents = (int) (amount * 100);
		paymentSystem.makePayment(amountInCents);
	}
}