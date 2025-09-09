package fiftyprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddNumber {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 78, 66, 59, 6, 84, 5, 21, 67);

		Map<Boolean, List<Integer>> evenOdd = numbers.stream().sorted().collect(Collectors.partitioningBy(n -> n % 2 == 0));

		System.out.println("Even numbers: " + evenOdd.get(true));
		System.out.println("odd numbers: " + evenOdd.get(false));

	}

}
