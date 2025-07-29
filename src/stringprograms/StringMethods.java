package stringprograms;

public class StringMethods {

	public static void main(String arr[]) {
		String languageName = "Perplexity";
		String aiName = "perplexity";
		String aiModel = "ChaGpt-4";

		String sentence = languageName + aiName;

		System.out.println("String length: " + sentence.length());

		if (languageName.compareTo(aiName) == 0) {
			System.out.println("string are equals using compareTo() method");
		} else
			System.out.println("String are not equals using compareTo() method\"");

		if (languageName.equals(aiName)) {
			System.out.println("String are equals using .equals() method");
		} else {
			System.out.println("String are not equals using .equals() method");
		}

		if (languageName.equalsIgnoreCase(aiName)) {
			System.out.println("String are equals using .equalsIgnoreCase() method");
		} else {
			System.out.println("String are not equals using .equalsIgnoreCase() method");
		}

		String subString = sentence.substring(10, sentence.length());
		System.out.println("Got the substring using .substring() method : " + subString);

		String birthyear = "2002";
		int number = Integer.parseInt(birthyear);
		System.out.println("year of birth converted into int: " + number);

		int dateOfbirth = 1652;
		String strings = Integer.toString(dateOfbirth);
		System.out.println("Date of birth converted into String: " + strings);

		if (strings.trim().isEmpty()) {
			System.out.println("string is empty");
		} else {
			System.out.println("content is available in strings: " + strings);
		}

		System.out.println(String.join(",", languageName, aiName, aiModel));

		String fullname = "omkar kavtikwar";
		System.out.println(fullname.replace("omkar", "aniket"));
		System.out.println(fullname.replaceFirst("omkar", "aniket"));
		System.out.println(fullname.replaceAll("omkar(.*)", "aniket"));

		System.out.println(fullname.indexOf("r"));
		System.out.println(fullname.lastIndexOf("r"));
		System.out.println(fullname.charAt(3));
		System.out.println(fullname.contains("r"));
		System.out.println(fullname.startsWith("r"));
		System.out.println(fullname.endsWith("r"));
		System.out.println(fullname.toUpperCase());
		System.out.println(fullname.toLowerCase());

		int num = 15;
		String numberString = String.valueOf(num);
		System.out.println(numberString);
		char[] charArray = numberString.toCharArray();

	}

}
