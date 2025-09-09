package fiftyprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEvenOdd {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(15, 45, 45, 41, 15, 8, 6, 6);
		Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println(partitionedNumbers);
	}

}
