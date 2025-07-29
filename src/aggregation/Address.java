package aggregation;

public class Address {
	
	 String city;
	 String state;
	 int pincode;
	
	public Address(String city, String state, int pincode) {
		this.city=city;
		this.state=state;
		this.pincode=pincode;
	}
	
	void displayAddress() {
		System.out.println("City: "+city+"\n"+"State: "+state+"\n"+"Pin code: "+pincode);
	}
	

}
