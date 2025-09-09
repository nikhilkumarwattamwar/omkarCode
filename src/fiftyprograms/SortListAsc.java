package fiftyprograms;

import java.util.Arrays;
import java.util.List;

public class SortListAsc {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(15, 45, 45, 41, 6);

		numbers.stream().sorted().forEach(System.out::println);
	}

}
