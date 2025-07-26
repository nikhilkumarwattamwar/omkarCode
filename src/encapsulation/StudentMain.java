package encapsulation;

public class StudentMain {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Omkar");
		s.setAge(23);
		s.setRollNumber("2125731245544");

		System.out.println("Name: " + s.getName());
		System.out.println("Age: " + s.getAge());
		System.out.println("Roll Number: " + s.getRollNumber());
	}

}
