package fiftyprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStrings {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("omkar", "sumedh", "Vinayak", "Rohan", "Sumedh", "girish");
		String result = names.stream().collect(Collectors.joining(", "));
		System.out.println(result);
	}

}
