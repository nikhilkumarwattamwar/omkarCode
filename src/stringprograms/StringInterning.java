package stringprograms;

public class StringInterning {

	public static void main(String[] args) {
		String s1 = "Omkar";
		String s2 = new String("Omkar").intern();
		String s3 = "Java";

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
	}

}
