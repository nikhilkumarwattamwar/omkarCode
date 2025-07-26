package exceptionhandling;
//returning value of finally block 2 because finally block return method is overriding
public class Program4 {

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
