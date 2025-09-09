package fiftyprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstEven {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5, 78, 66, 59, 6, 84, 5, 21, 67);
		
	   Optional<Integer> firstEven=	numbers.stream().filter(n->n%2==0).findFirst();
	   System.out.println("First even numner: "+firstEven.get());

	}

}
