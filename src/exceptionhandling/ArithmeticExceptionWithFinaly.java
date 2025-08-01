package exceptionhandling;

public class ArithmeticExceptionWithFinaly {

	public static void main(String[] args) {
		int divide, a = 10, b = 0;

		try {
			divide = a / 5;
			System.out.println(divide);
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());

		}finally {
			System.out.println("finaly block executed");
		};
		System.out.println("program exceuted completely");
	}
}
