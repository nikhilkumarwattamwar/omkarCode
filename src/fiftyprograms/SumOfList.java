package fiftyprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SumOfList {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(15, 45, 45, 41, 6);
		int add=numbers.stream().mapToInt(Integer::intValue).sum();
				
System.out.println("Additon of all numbers: "+add);
	}

}
