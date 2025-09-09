package fiftyprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondLargest {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 50, 20, 40, 50);
		Optional<Integer> secondLargest = numbers.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst()
				;
		System.out.println("Second Largest number : " + secondLargest.get());
	}

}
