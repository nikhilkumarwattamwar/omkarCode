package fiftyprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListDesc {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(15, 45, 45, 41, 6);

		numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}

}
