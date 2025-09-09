package fiftyprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5, 78, 66, 59, 6, 84, 5, 21, 67);
		
		Collections.reverse(numbers);
		System.out.println(numbers);
	}

}
