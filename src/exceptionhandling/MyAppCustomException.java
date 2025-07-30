package exceptionhandling;

public class MyAppCustomException extends Exception {
	public MyAppCustomException(String message, Throwable cause) {
        super(message, cause);
    }

}
