package aggregation;

public class EmpMain {

	public static void main(String[] args) {
		
		Address address=new Address("Nanded","Maharashtra",431602);
		Employee employee= new Employee(101,"Omkar",address);
		employee.displayEmpDetails();
	}
}
