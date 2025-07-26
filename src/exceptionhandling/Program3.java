package exceptionhandling;

//in this program we are checking the how finally block works
public class Program3 {

	public static void main(String[] args) {
		int divide, a = 10, b = 0;

		try {
			divide = a / 5;
			System.out.println(divide);
		} catch (ArithmeticException ae) {
//			ae.printStackTrace();
			System.out.println(ae.getMessage());

		}finally {
			System.out.println("finaly block executed");
		}
		;
		System.out.println("program exceuted completely");

	}
}
