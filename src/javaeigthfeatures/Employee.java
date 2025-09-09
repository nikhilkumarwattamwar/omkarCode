package javaeigthfeatures;

import java.util.*;

public class Employee {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 1, 2));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(5, 2, 8, 2));

		LinkedList<Integer> linkedList = new LinkedList<Integer>(list2);

		List<Integer> finalList = new ArrayList<>();
		finalList.addAll(list1);
		finalList.addAll(list2);

		System.out.println(linkedList);

	}

}
