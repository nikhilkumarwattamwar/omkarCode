package collectionprograms;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();

		hs.add("Omkar");
		hs.add("Aniket");
		hs.add("Ramesh");
		hs.add("Suresh");
		hs.add("Shubham");
		hs.add("Vinay");

		System.out.print("Using iterator : ");
		Iterator<String> iterator = hs.iterator();
		while (iterator.hasNext())
			System.out.print(iterator.next() + " ");

		System.out.println();

		System.out.print("Using for each loop : ");
		for (String element : hs)
			System.out.print(element + " ");
	}
}
