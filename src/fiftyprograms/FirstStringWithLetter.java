package fiftyprograms;

import java.util.Arrays;
import java.util.List;

public class FirstStringWithLetter {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("omkar", "sumedh", "Vinayak", "Rohan", "Sumedh", "girish", "Chohan");
		String first = names.stream().filter(s -> s.startsWith("C")).findFirst().orElse("Not Found");
		System.out.println("First word starting with C: " + first);
	}
}
