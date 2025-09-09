package fiftyprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxInList {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(15, 45, 45, 41, 6);

		int max = Collections.max(numbers);
		System.out.println("Maximumn number in the given list is:  " + max);

	}

}
