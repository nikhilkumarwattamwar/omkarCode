package abstraction;

public class CreditCardMain {

	public static void main(String[] args) {
		CreditCard visa = new VisaCard("5007-6463-1245-8546", 10000);
		visa.displayCardInfo();
		System.out.println("Interest: " + visa.calculateInterest());
		System.out.println();
		CreditCard master = new MasterCard("6468-8451-3265-6024", 20000);
		master.displayCardInfo();
		System.out.println("Interest: " + master.calculateInterest());
	}

}
