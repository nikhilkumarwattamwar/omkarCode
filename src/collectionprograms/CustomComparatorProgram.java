package collectionprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomComparatorProgram {

	public static void main(String[] args) {

		Comparator<Integer> compare = new Comparator<Integer>() {
			public int compare(Integer element1, Integer element2) {
				if (element1 % 10 > element2 % 10)
					return 1;
				else
					return -1;
			}
		};
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(45);
		list.add(14);
		list.add(59);
		list.add(87);

		Collections.sort(list, compare);

		for (int number : list) {
			System.out.println(number);
		}

	}
}
