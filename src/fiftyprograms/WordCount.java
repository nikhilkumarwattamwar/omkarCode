package fiftyprograms;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {

	public static void main(String[] args) {
		String sentence = "i am Learnig core java , after that i want to learn advacne java";
		Map<String, Long> wordCount = Arrays.stream(sentence.split(" "))
				.collect(Collectors.groupingBy(w -> w, Collectors.counting()));
		System.out.println(wordCount);
	}
}
