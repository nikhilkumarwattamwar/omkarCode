package fiftyprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinInList {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(15, 45, 45, 41, 6);

		int min = Collections.min(numbers);
		System.out.println("Maximumn number in the given list is:  " + min);

	}

}
