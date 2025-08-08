package collectionprograms;

import java.util.*;

public class LinkedHashMapProgram {
	public static void main(String args[]) {
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

		linkedHashMap.put(3, "Omkar");
		linkedHashMap.put(2, "Aniket");
		linkedHashMap.put(1, "Rohit");

		System.out.println(linkedHashMap);

		linkedHashMap.putIfAbsent(4, "Ramesh");
		linkedHashMap.remove(2);
		linkedHashMap.replace(3, "Vinay");

		System.out.println("Contains key 1: " + linkedHashMap.containsKey(1));
		System.out.println("Contains value Java: " + linkedHashMap.containsValue("Java"));

		for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
		}

		System.out.println("Keys: " + linkedHashMap.keySet());
		System.out.println("Values: " + linkedHashMap.values());
		System.out.println("Size: " + linkedHashMap.size());
		linkedHashMap.clear();
		System.out.println(linkedHashMap);
	}
}
