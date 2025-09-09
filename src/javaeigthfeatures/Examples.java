package javaeigthfeatures;

import java.util.*;
import java.util.stream.Collectors;

public class Examples {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("java", "python", "programming");

		list.stream().map(String::length).forEach(System.out::println);

		List<String> flatMap = list.stream().flatMap(name -> Arrays.stream(name.split(",")))
				.collect(Collectors.toList());
		System.out.println("list is Splitted by ',': " + flatMap);

	}

}
