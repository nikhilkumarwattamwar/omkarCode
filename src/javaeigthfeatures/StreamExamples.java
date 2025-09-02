package javaeigthfeatures;

import java.util.*;
import java.util.stream.IntStream;

public class StreamExamples {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 5, 8, 0, 3, 5, 4, 8, 6);

		Optional<Integer> max = list.stream().sorted(Comparator.reverseOrder()).findFirst();
		System.out.println(max.get());

		Optional<Integer> secondMax = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
		System.out.println(secondMax.get());

		Optional<Integer> firstNonDuplicate = list.stream().filter(d -> Collections.frequency(list, d) == 1).skip(1)
				.findFirst();
		System.out.println(firstNonDuplicate.get());

		List<String> nl = Arrays.asList("omakr", "shubham", "vinay", "Shrinivas");

		nl.stream().sorted((s1, s2) -> s2.length() - s1.length()).forEach(System.out::println);

		nl.stream().map(String::length).forEach(System.out::println);

		Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
		System.out.println(min.get());

		System.out.println(nl.stream().filter(s -> s.length() > 5).count());

		System.out.println("Printing the fibonnaci series using stram: ");
		int[] fib = { 0, 1 };

		IntStream.generate(() -> {
			int next = fib[0];
			int temp = fib[0] + fib[1];
			fib[0] = fib[1];
			fib[1] = temp;
			return next;

		}).takeWhile(m -> m <= 50).forEach(System.out::println);

		IntStream.rangeClosed(40, 50).filter(n -> n % 2 == 0).forEach(System.out::println);

	}

}
