package javaeigthfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExamples {

	public static void main(String[] args) {

		List<Integer> list = Stream.of(1, 2, 5, 10, 5, 2).collect(Collectors.toList());
		System.out.println(list);

		int sum = list.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("Sum: " + sum);

		double avg = list.stream().collect(Collectors.averagingInt(Integer::intValue));
		System.out.println("Average: " + avg);

		long noOfElements = list.stream().collect(Collectors.counting());
		System.out.println("No of Elements in list: " + noOfElements);

		long sqaureOfSum = list.stream().map(s -> s * s).collect(Collectors.summingInt(Integer::intValue));
		System.out.println("sum of squares of each number: " + sqaureOfSum);

		long SquareOfSum2 = list.stream().mapToInt(n -> n * n).sum();
		System.out.println("sum of squares of each number: " + SquareOfSum2);

		String str = "Omkar";
		String reversed = Arrays.stream(str.split("")).reduce("", (rev, ch) -> ch + rev);
		System.out.println("Reversed string suing stream: " + reversed);

	}

}
