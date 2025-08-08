package collectionprograms;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapProgram {
	public static void main(String[] args) {
		Map<String, Integer> treeMap = new TreeMap<>();

		treeMap.put("A", 1);
		treeMap.put("C", 3);
		treeMap.put("B", 2);

		int ans = treeMap.get("A");
		System.out.println("Value of A: " + ans);

		treeMap.remove("B");

		for (String key : treeMap.keySet()) 	{
			System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
		}
	}
}
