package fiftyprograms;

import java.util.Arrays;
import java.util.List;

public class SortStrings {
	
	 public static void main(String[] args) {
			List<String> names = Arrays.asList("omkar", "sumedh", "Vinayak", "Rohan", "Sumedh", "girish");
	        List<String> sorted = names.stream().sorted().toList();
	        System.out.println("Alpabeticaly assedning: "+sorted);
	    }

}
