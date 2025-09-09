package fiftyprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxStringLength {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("omkar", "sumedh", "Vinayak", "null", "Rohan", "Sumedh", "girish");
		String maxLength = names.stream().max(Comparator.comparingInt(String::length)).orElse("");
		System.out.println("Longest string is : " + maxLength);
	}

}
