package abstraction;

abstract class CreditCard {
	protected String cardNumber;
	protected double balance;

	public CreditCard(String cardNumber, double balance) {
		this.cardNumber = cardNumber;
		this.balance = balance;
	}

	abstract double calculateInterest();

	public void displayCardInfo() {
		System.out.println("Card Number: " + cardNumber);
		System.out.println("Balance: " + balance);
	}
}

class VisaCard extends CreditCard {
	public VisaCard(String cardNumber, double balance) {
		super(cardNumber, balance);
	}

	@Override
	double calculateInterest() {
		return balance * 0.015;
	}
}

class MasterCard extends CreditCard {
	public MasterCard(String cardNumber, double balance) {
		super(cardNumber, balance);
	}

	@Override
	double calculateInterest() {
		return balance * 0.018;
	}
}
