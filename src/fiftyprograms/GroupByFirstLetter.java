package fiftyprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstLetter {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Omkar", "Sumedh", "Vinayak", "Rohan", "Sumedh", "Girish");
		Map<Character, List<String>> grouped = names.stream().collect(Collectors.groupingBy(w -> w.charAt(0)));
		System.out.println(grouped);
	}

}
