package fiftyprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(15, 45, 45, 41, 15, 8, 6, 6);
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = numbers.stream().filter(n -> !seen.add(n)).collect(Collectors.toSet());
		System.out.println(duplicates);
	}

}
