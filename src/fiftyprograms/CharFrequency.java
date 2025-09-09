package fiftyprograms;

import java.util.Map;
import java.util.stream.Collectors;

public class CharFrequency {

	public static void main(String[] args) {
		String str = "Omkar";
		Map<Character, Long> freq = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(freq);
	}

}
