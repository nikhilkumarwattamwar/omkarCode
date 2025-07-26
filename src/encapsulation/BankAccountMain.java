package encapsulation;

import java.util.Scanner;

public class BankAccountMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankAccount account = new BankAccount();

		System.out.print("Enter account number: ");
		String accNum = scanner.nextLine();
		account.setAccountNumber(accNum);

		boolean running = true;

		while (running) {
			System.out.println("\nChoose an option:");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter amount to deposit: ");
				double depositAmount = scanner.nextDouble();
				account.deposit(depositAmount);
				System.out.println("Deposit successful, current balance: " + account.getBalance());
				break;

			case 2:
				System.out.print("Enter amount to withdraw: ");
				double withdrawAmount = scanner.nextDouble();
				boolean success = account.withdraw(withdrawAmount);
				if (success) {
					System.out.println("Withdrawal successful now Current balance is : " + account.getBalance());
				} else {
					System.out.println("Withdrawal failed, insufficient balance.");
				}
				break;

			case 3:
				System.out.println("Current balance: " + account.getBalance());
				break;

			case 4:
				System.out.println("Thank you, exiting...");
				running = false;
				break;

			default:
				System.out.println("Invalid choice please try again.");
			}
		}

		scanner.close();
	}

}
