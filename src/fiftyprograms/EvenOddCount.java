package fiftyprograms;

import java.util.Arrays;
import java.util.List;

public class EvenOddCount {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		long evenCount = numbers.stream().filter(n -> n % 2 == 0).count();
		long oddCount = numbers.stream().filter(n -> n % 2 != 0).count();

		System.out.println("Even numbers are : " + evenCount + ",\nOdd numbers are: " + oddCount);
	}

}
