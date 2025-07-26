package exceptionhandling;
//here we are writing the program for handling the run time exception
public class Program1 {
	

	
	
	public static void main(String[] args) {
		
		int divide,a=10,b=0;
		
		try {
		divide = a/b;
		System.out.println(divide);
		}catch(ArithmeticException ae) {
//			ae.printStackTrace();
			System.out.println(ae.getMessage());
			
		};
		System.out.println("program exceuted completely");
		
	}

}


