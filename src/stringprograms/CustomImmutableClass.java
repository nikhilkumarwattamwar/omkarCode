package stringprograms;

public class CustomImmutableClass {

	private final String accountHolderName;
	private final String accountNumber;
	private final double balance;

	public CustomImmutableClass(String accountHolderName, long accountNumber, double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = String.valueOf(accountNumber);
		this.balance = balance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		CustomImmutableClass immutableObject = new CustomImmutableClass("Omkar Kavtikar", 3944073315L, 1000000);

		System.out.println("Account Holder name: " + immutableObject.getAccountHolderName());
		System.out.println("Account Number: " + immutableObject.getAccountNumber());
		System.out.println("Balance: " + immutableObject.getBalance());

	}

}
