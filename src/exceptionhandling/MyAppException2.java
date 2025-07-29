package exceptionhandling;

public class MyAppException2 extends Exception {
	public MyAppException2(String message, Throwable cause) {
        super(message, cause); // exception chaining
    }

}
