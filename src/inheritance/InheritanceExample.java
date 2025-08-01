package inheritance;

class Animal {
	void sound() {
		System.out.println("Animal sound");
	}

	public void findBall() {
		System.out.println("Animal finding ball");
	}

}

class Dog extends Animal {
	void sound() {
		System.out.println("Dogs sound");
	}

	public void findBall() {
		System.out.println("Dog finding the ball");
	}

}

class Cat extends Animal {
	void sound() {
		System.out.println("Cats sound");
	}
}

class Monkey extends Animal {
	void sound() {
		System.out.println("Monkeys sound");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.findBall();

		Monkey M = new Monkey();
		M.sound();

	}

}
