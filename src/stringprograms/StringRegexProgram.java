package stringprograms;

import java.util.Scanner;

public class StringRegexProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an email address: ");
		String email = scanner.nextLine();

		if (emailValidation(email)) {
			System.out.println("Valid email address");
		} else {
			System.out.println("Invalid email address");
		}

		scanner.close();
	}

	public static boolean emailValidation(String email) {
		int atTheRateIndex = email.indexOf('@');
		int lastAtTheRateIndex = email.lastIndexOf('@');
		if (atTheRateIndex <= 0 || atTheRateIndex != lastAtTheRateIndex)
			return false;

		int dotIndex = email.lastIndexOf('.');
		if (dotIndex < atTheRateIndex + 2 || dotIndex == email.length() - 1)
			return false;

		String username = email.substring(0, atTheRateIndex);
		String domain = email.substring(atTheRateIndex + 1);
		if (username.length() == 0 || domain.length() < 3)
			return false;

		if (domain.startsWith(".") || domain.endsWith("."))
			return false;

		if (email.contains(" "))
			return false;

		return true;
	}

}
