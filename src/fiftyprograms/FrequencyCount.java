package fiftyprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyCount {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Omkar", "Sumedh", "Vinayak", "Rohan", "Sumedh", "Girish");

		Map<String, Long> wordFrequency = names.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));

		System.out.println("Word frequency :");
		for (Map.Entry<String, Long> entry : wordFrequency.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}
