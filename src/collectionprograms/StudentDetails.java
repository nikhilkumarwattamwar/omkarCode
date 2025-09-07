package collectionprograms;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDetails {

	int id;
	String name;
	double marks;

	StudentDetails(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	void display() {
		System.out.println("id: " + id + " Name: " + name + " Marks: " + marks);
	}

	public static void main(String[] args) {

		ArrayList<StudentDetails> studentarray = new ArrayList<>();

		studentarray.add(new StudentDetails(101, "Omkar", 500));
		studentarray.add(new StudentDetails(102, "Aniket", 400));
		studentarray.add(new StudentDetails(103, "Shubham", 350));
		studentarray.add(new StudentDetails(104, "Rohan", 500));
		studentarray.add(new StudentDetails(105, "Vinay", 430));

		for (StudentDetails students : studentarray) {
			students.display();
		}

		studentarray.get(1).display();

		studentarray.set(0, new StudentDetails(101, "Ritesh", 450));
		studentarray.get(0).display();
		;

		System.out.println("\nremoving the rohan");
		studentarray.remove(3).display();

		System.out.println("\n\nafter performerd all operation data us like:");
		for (StudentDetails students : studentarray) {
			students.display();
		}

		Collections.sort(studentarray, new NameLengthComparator());

		System.out.println("\nStudents sorted by name length:");
		for (StudentDetails student : studentarray) {
			System.out.println(student.name);
		}

	}

}
