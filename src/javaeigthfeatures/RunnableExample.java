package javaeigthfeatures;

public class RunnableExample {

	public static void main(String[] args) {

		Runnable r = () -> System.out.println("hello omkar");
		new Thread(r).start();

	}

}
