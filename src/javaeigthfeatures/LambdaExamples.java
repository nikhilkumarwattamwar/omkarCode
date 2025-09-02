package javaeigthfeatures;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaExamples {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Class", "Object", "Method");
		list.forEach(item -> System.out.println(item));

		System.out.println("\nSorted using lambda: ");
		list.sort((s1, s2) -> s1.compareTo(s2));
		list.forEach(System.out::println);

		Runnable r = () -> System.out.println("Hello,Lambda");
		new Thread(r).start();

		System.out.println("iterated using lambda");
		List<String> nameList = Arrays.asList("omakr", "shubham", "vinay");
		nameList.forEach(name -> System.out.println(name));

		System.out.println("Started with s");
		List<String> filteredList = nameList.stream().filter(s -> s.startsWith("s")).collect(Collectors.toList());
		filteredList.forEach(s -> System.out.println(s));

		Map<String, Integer> map = new HashMap<>();
		map.put("java", 8);
		map.put("spring", 5);
		map.put("lambda", 1);
		map.forEach((key, value) -> System.out.println(key + ": " + value));

	}

}
