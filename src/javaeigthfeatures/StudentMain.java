package javaeigthfeatures;

import java.util.*;
import java.util.stream.Collectors;

class Student {
	private int id;
	private String name;
	private String city;
	private double fees;

	public Student(int id, String name, String city, double fees) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public double getFees() {
		return fees;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + city + " " + fees;
	}
}

class StudentService {
	private List<Student> students;

	public StudentService(List<Student> students) {
		this.students = students;
	}

	public void sortByName() {
		students.stream().sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);
	}

	public void sortByFees() {
		students.stream().sorted(Comparator.comparingDouble(Student::getFees)).forEach(System.out::println);
	}

	public void nameStartsWith(String prefix) {
		students.stream().filter(s -> s.getName().startsWith(prefix)).forEach(System.out::println);
	}

	public void groupByCity() {
		Map<String, List<Student>> cityWise = students.stream().collect(Collectors.groupingBy(Student::getCity));

		cityWise.forEach((city, stuList) -> {
			System.out.println(city + " " + stuList);
		});
	}

	public void findByCity(String city) {
		students.stream().filter(s -> s.getCity().equalsIgnoreCase(city)).forEach(System.out::println);
	}

	public void feesGreaterThan(double amount) {
		students.stream().filter(s -> s.getFees() > amount).forEach(System.out::println);
	}

	public void highestFeesStudent() {
		students.stream().max(Comparator.comparingDouble(Student::getFees)).ifPresent(System.out::println);
	}

	public void lowestFeesStudent() {
		students.stream().min(Comparator.comparingDouble(Student::getFees)).ifPresent(System.out::println);
	}
}

public class StudentMain {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student(1, "Aniket", "Pune", 35000),
				new Student(2, "Ravi", "Mumbai", 45000), new Student(3, "Sneha", "Pune", 30000),
				new Student(4, "Amit", "Delhi", 50000), new Student(5, "Priya", "Mumbai", 42000));

		StudentService service = new StudentService(studentList);

		System.out.println("\n--- Sorted by Name ---");
		service.sortByName();

		System.out.println("\n--- Sorted by Fees ---");
		service.sortByFees();

		System.out.println("\n--- Names starting with 'A' ---");
		service.nameStartsWith("A");

		System.out.println("\n--- Grouped by City ---");
		service.groupByCity();

		System.out.println("\n--- Students from Mumbai ---");
		service.findByCity("Mumbai");

		System.out.println("\n--- Students with Fees > 40000 ---");
		service.feesGreaterThan(40000);

		System.out.println("\n--- Highest Fees Student ---");
		service.highestFeesStudent();

		System.out.println("\n--- Lowest Fees Student ---");
		service.lowestFeesStudent();
	}
}
