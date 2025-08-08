package collectionprograms;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {
	public static void main(String[] args) {

		HashMap<String, Integer> students = new HashMap<>();
		students.put("omkar", 90);
		students.put("Aniket", 80);
		students.put("siddhesh", 95);
		students.put("Shubham", 70);

		for (Map.Entry<String, Integer> entry : students.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println(students.containsKey("Aniket"));

		System.out.println(students.containsValue(95));

		System.out.println("no.of students: " + students.size());

		students.remove("Omkar");

		students.replace("Aniket", 85);

		students.putIfAbsent("Shubham", 70);

		System.out.println("All student names: " + students.keySet());

		System.out.println("All marks: " + students.values());

		for (Map.Entry<String, Integer> entry : students.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
