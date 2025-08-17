package javaeigthfeatures;

import java.util.*;

public class LambdaExamples {
	
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Class","Object","Method");
		list.forEach(item->System.out.println(item));
		
		System.out.println("\nafter sorting the elements:");
		
		list.sort((s1,s2)->s1.compareTo(s2));
		list.forEach(System.out::println);
		
		
		
	}

}
