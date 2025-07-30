package exceptionhandling;
public class FinalyMethodCheck {

	public static void main(String[] args) {
		System.out.println(test());
		System.out.println(test1());
	}

	static int test() {
		try {
			return 1;
		} finally {
			return 2;
		}
	}
	
	static String test1() {
		try {
			return display();
		} finally {
			return "finally";
		}
	}
	static String display() {
		return "display";
	}
}
