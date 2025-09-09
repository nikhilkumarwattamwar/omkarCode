package fiftyprograms;

import java.util.Arrays;
import java.util.List;

public class ReduceSum {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(15, 45, 45, 41, 15, 8, 6, 6);
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("Sum of all numbers using reduce : " + sum);
	}

}
