package fiftyprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthWiseStrings {
	
	  public static void main(String[] args) {
			List<String> names = Arrays.asList("omkar", "sumedh", "Vinayak", "Rohan", "Sumedh", "girish");
	        List<Integer> lengths = names.stream()
	                                     .map(String::length)
	                                     .collect(Collectors.toList());
	        System.out.println(lengths);
	    }

}
