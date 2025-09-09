package fiftyprograms;

import java.util.Arrays;
import java.util.List;

public class AllMatchExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 78, 66, 59, 6, 84, 5, 21, 67);
		boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
		System.out.println("All numbers are even: " + allEven);
	}
}
