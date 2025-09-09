package fiftyprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringsDesc {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("omkar", "sumedh", "Vinayak", "Rohan", "Sumedh", "girish");
		List<String> sorted = names.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(sorted);
	}

}
