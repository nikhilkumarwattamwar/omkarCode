package aggregation;

public class EmpMain {

	public static void main(String[] args) {
		
		Address adr=new Address("Nanded","Maharashtra",431602);
		Employee emp1= new Employee(101,"Omkar",adr);
		emp1.displayEmpDetails();
	}
}
