package fiftyprograms;

import java.util.Arrays;
import java.util.List;

public class UppercaseList {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("omkar", "sumedh", "Vinayak", "Rohan", "Sumedh", "girish");
		
		names.stream().map(name->name.toUpperCase()).forEach(System.out::println);
		
	}
	
	


}
