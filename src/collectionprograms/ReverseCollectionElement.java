package collectionprograms;

import java.util.*;

public class ReverseCollectionElement {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(65);
		List<Integer> oddNumbers = Arrays.asList(15, 13, 57, 83, 91, 33);
		list.addAll(oddNumbers);

		List<Integer> revrseList = new ArrayList<>();

		for (int i = list.size() - 1; i >= 0; i--) {
			revrseList.add(list.get(i));
		}

		System.out.println("Reversed without using reverse method" + revrseList);
		Collections.reverse(list);
		System.out.println("Reversed using reverse method" + list);
	}

}
