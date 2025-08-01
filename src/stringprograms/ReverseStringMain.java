package stringprograms;

public class ReverseStringMain {

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString("Kavtikwar");
		reverseString.Display();
		System.out.println("Reversed string using class local method: "
				+ reverseString.reverseStringOutput(reverseString.getString()));
		System.out.println(reverseString.reverseStringOutput("Nanded"));

	}

}
