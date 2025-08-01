package stringprograms;

public class StudentStringInterning {

	private String name;

	public StudentStringInterning(String name) {
		this.name = name.intern();
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		StudentStringInterning firstStudent = new StudentStringInterning("Omkar");
		StudentStringInterning secondStudent = new StudentStringInterning(new String("Omkar"));
		StudentStringInterning thirdStudent = new StudentStringInterning("Java");

		System.out.println(firstStudent.getName() == secondStudent.getName());
		System.out.println(firstStudent.getName() == thirdStudent.getName());
	}

}
