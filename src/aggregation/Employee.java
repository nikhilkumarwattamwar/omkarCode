package aggregation;
//example of the aggregation means has-a relationship
public class Employee {
	int id;
	String name;
	Address address;

	public Employee(int id,String name, Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void displayEmpDetails() {
		System.out.println("Emp id: "+id+"\n"+"Emp name: "+name+"\n"+"Emp Address: ");
		address.displayAddress();
	}

}
