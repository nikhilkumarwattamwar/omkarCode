package collectionprograms;

import java.util.*;

public class BackedByCollection {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(15, 45, 82, 76, 45);

		try {
			list.set(0, null);
			System.out.println(list.get(2));
			list.remove(0);
			System.out.println(list);
		} catch (UnsupportedOperationException uoe) {
			System.out.println("You cannot add or remove the list because its a fixed array");
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie.getMessage());
		}
	}

}
