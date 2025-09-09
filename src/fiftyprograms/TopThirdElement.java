package fiftyprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TopThirdElement {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 50, 20, 40, 60, 70);
		List<Integer> topThree = numbers.stream().sorted(Collections.reverseOrder()).limit(3)
				.collect(Collectors.toList());
		System.out.println("Highest three numbers: " + topThree);
	}

}
