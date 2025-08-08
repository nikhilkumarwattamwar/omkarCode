package collectionprograms;

import java.util.LinkedList;

public class StudentDetailsList {

	int id;
	String name;
	double marks;

	StudentDetailsList(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	void display() {
		System.out.println("id: " + id + " Name: " + name + " Marks: " + marks);
	}

	public static void main(String[] args) {

		LinkedList<StudentDetailsList> studentList = new LinkedList<>();

		studentList.add(new StudentDetailsList(101, "Omkar", 500));
		studentList.add(new StudentDetailsList(102, "Aniket", 400));
		studentList.add(new StudentDetailsList(103, "Shubham", 350));
		studentList.add(new StudentDetailsList(104, "Rohan", 500));
		studentList.add(new StudentDetailsList(105, "Vinay", 430));

		System.out.println("Original list:");
		for (StudentDetailsList student : studentList) {
			student.display();
		}

		System.out.println("\n Displaying second student:");
		studentList.get(1).display();

		System.out.println("\n Updating the first student:");
		studentList.set(0, new StudentDetailsList(101, "Ritesh", 450));
		studentList.get(0).display();

		System.out.println("\n Removing Rohan from the list :");
		studentList.remove(3).display();

		System.out.println("\nAdding at the beginning");
		studentList.addFirst(new StudentDetailsList(100, "Somesh", 600));

		System.out.println("\n Adding at the end");
		studentList.addLast(new StudentDetailsList(106, "Ramesh", 300));

		System.out.println("\n Removing first element");
		studentList.removeFirst().display();

		System.out.println("\n Removing last element");
		studentList.removeLast().display();

		System.out.println("\nFinal student list after LinkedList operations:");
		for (StudentDetailsList student : studentList) {
			student.display();
		}

		System.out.println(" First student:");
		studentList.getFirst().display();

		System.out.println(" Last student:");
		studentList.getLast().display();
	}

}
