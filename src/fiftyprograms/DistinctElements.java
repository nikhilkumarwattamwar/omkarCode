package fiftyprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElements {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(15, 45, 45, 41, 15, 8, 6, 6);
		List<Integer> distinct = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique elemnts: " + distinct);
	}
}
