package stringprograms;

public class ReverseString {

	private String stringValue;

	public ReverseString(String string) {
		this.stringValue = string;
	}

	public String getString() {
		return stringValue;
	}

	public void Display() {
		System.out.println(
				"String reversed using local method with constructor value:  " + reverseStringOutput(this.stringValue));
	}

	public String reverseStringOutput(String stringValue) {

		String reverseString = "";
		for (int i = stringValue.length() - 1; i >= 0; i--) {
			reverseString = reverseString + stringValue.charAt(i);
		}

		return reverseString;

	}

}
