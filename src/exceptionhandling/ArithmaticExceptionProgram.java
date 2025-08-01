package exceptionhandling;

public class ArithmaticExceptionProgram {
	public static void main(String[] args) {
		int divide,a=10,b=0;
		try {
		divide = a/b;
		System.out.println(divide);
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		};
		System.out.println("program exceuted completely");
		
	}

}


