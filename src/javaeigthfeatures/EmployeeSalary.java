package javaeigthfeatures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeSalary {

	private String name;
	private int salary;
	private String gender;
	private String department;

	public EmployeeSalary(String name, int salary, String gender, String department) {
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + " " + gender + " " + salary + " " + department;
	}

	public static void main(String[] args) {

		List<EmployeeSalary> employees = Arrays.asList(new EmployeeSalary("Ramesh", 20000, "Male", "IT"),
				new EmployeeSalary("Rinku", 20000, "Female", "HR"),
				new EmployeeSalary("Rahul", 30000, "Male", "Finance"),
				new EmployeeSalary("Nikita", 50000, "Female", "IT"),
				new EmployeeSalary("Somesh", 20000, "Male", "Marketing"),
				new EmployeeSalary("Sushil", 90000, "Male", "Finance"),
				new EmployeeSalary("Dhiraj", 10000, "Male", "Support"),
				new EmployeeSalary("Anita", 45000, "Female", "HR"), new EmployeeSalary("Vikram", 75000, "Male", "IT"),
				new EmployeeSalary("Meena", 60000, "Female", "Marketing"),
				new EmployeeSalary("Kiran", 55000, "Male", "Sales"),
				new EmployeeSalary("Pooja", 48000, "Female", "Finance"),
				new EmployeeSalary("Arjun", 70000, "Male", "IT"), new EmployeeSalary("Neha", 65000, "Female", "HR"),
				new EmployeeSalary("Amit", 35000, "Male", "Support"),
				new EmployeeSalary("Sunita", 40000, "Female", "Sales"),
				new EmployeeSalary("Manoj", 80000, "Male", "Finance"),
				new EmployeeSalary("Priya", 72000, "Female", "IT"),
				new EmployeeSalary("Kavita", 30000, "Female", "Marketing"),
				new EmployeeSalary("Sandeep", 95000, "Male", "Management"));

		Map<String, Double> averageSal = employees.stream().collect(Collectors.groupingBy(EmployeeSalary::getGender,
				Collectors.averagingDouble(EmployeeSalary::getSalary)));
		System.out.println("Avergae salray returned in type Double::");
		System.out.println(averageSal);

		Map<String, Integer> avgSal = employees.stream().collect(Collectors.groupingBy(EmployeeSalary::getGender,
				Collectors.collectingAndThen(Collectors.averagingInt(EmployeeSalary::getSalary), Double::intValue)));
		System.out.println("\nAvergae salray returned in type Integer::");
		System.out.println(avgSal);

		// findin the highest salary of the female and male

		System.out.println("\nHighest salary of the male and female:: ");
		Map<String, Optional<EmployeeSalary>> maxSalary = employees.stream().collect(Collectors.groupingBy(
				EmployeeSalary::getGender, Collectors.maxBy(Comparator.comparingDouble(EmployeeSalary::getSalary))));

		maxSalary.forEach((gender, empOpt) -> {
			empOpt.ifPresent(emp -> System.out.println(emp));
		});

		System.out.println("\nThird Highest salary of the male and female:: ");

		Map<String, Optional<EmployeeSalary>> higestThirdemp = employees.stream()
				.collect(Collectors.groupingBy(EmployeeSalary::getGender,
						Collectors.collectingAndThen(Collectors.toList(),
								list -> list.stream()
										.sorted(Comparator.comparingDouble(EmployeeSalary::getSalary).reversed())
										.skip(2).findFirst())));

		higestThirdemp.forEach((gender, employee) -> System.out.println(employee.get()));

		System.out.println("\nDepartment wise list:: ");

		Map<String, List<EmployeeSalary>> departmentWise = employees.stream()
				.collect(Collectors.groupingBy(EmployeeSalary::getDepartment));

		departmentWise.forEach((departments, emp) -> {
			System.out.println("\nDepartment: " + departments);
			emp.forEach(System.out::println);
		});

		System.out.println("\nEmployees who have get more than 50000 salary:: ");

		Map<String, EmployeeSalary> greaterSalary = employees.stream().filter(e -> e.getSalary() > 50000)
				.collect(Collectors.toMap(EmployeeSalary::getName, e -> e));

		greaterSalary.forEach((name, emp) -> System.out.println(emp.getName() + "-> " + emp.getSalary()));

		Map<String, String> empSalary = employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("it"))
				.collect(Collectors.toMap(EmployeeSalary::getName, EmployeeSalary::getDepartment));

		empSalary.forEach((name, dept) -> System.out.println(name + " -> " + dept));

	}

}
