package stringprograms;

public class StringInterning {

	public static void main(String[] args) {
		String stringFirst = "Omkar";
		String stringSecond = new String("Omkar").intern();
		String stringThird = "Java";

		System.out.println(stringFirst == stringSecond);
		System.out.println(stringFirst == stringThird);
	}

}
