package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionProgram {

	public static void main(String[] args) {

		try {
			FileInputStream fi = new FileInputStream("d:/omkar.txt");
		} catch (FileNotFoundException e) {
			System.out.println("for checking the flow");
			e.printStackTrace();
		} catch (Exception e) {
			
			System.out.println(e);
		}

		System.out.println("program executed succesfully");

	}

}
