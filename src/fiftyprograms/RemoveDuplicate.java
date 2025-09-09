package fiftyprograms;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(15, 45, 45, 41, 15, 8, 6, 6);

		numbers.stream().distinct().forEach(System.out::println);
	}

}
