package fiftyprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveNulls {
	
	 public static void main(String[] args) {
			List<String> names = Arrays.asList("omkar", "sumedh",null, "Vinayak","null", "Rohan", "Sumedh", "girish");
	        List<String> filtered = names.stream()
	                                     .filter(Objects::nonNull)
	                                     .collect(Collectors.toList());
	        System.out.println(filtered);
	    }

}
