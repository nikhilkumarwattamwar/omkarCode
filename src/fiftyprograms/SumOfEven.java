package fiftyprograms;

import java.util.Arrays;
import java.util.List;

public class SumOfEven {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 78, 66, 59, 6, 84, 5, 21, 67);
		int sumEven = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of even numbers: " + sumEven);
	}

}
