package exceptionhandling;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class AutoChainingDemo {
	public static void main(String[] args) {
		try {
			processFile();
		} catch (MyAppCustomException e) {
			System.out.println("Custom exception caught: " + e.getMessage());
			System.out.println("Original cause: " + e.getCause());
			e.printStackTrace();
		}
		
	}

	static void processFile() throws MyAppCustomException {
		try {
			FileReader reader = new FileReader("omkar.txt");
		} catch (FileNotFoundException e) {
			throw new MyAppCustomException("not able to read file", e);
		}
	}
}
