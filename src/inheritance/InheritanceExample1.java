//in this example of single-level-inheriance in which dog,cat,and monkey child classes are extending the animal parent class
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



public class InheritanceExample1 {

	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.findBall();
		
		Monkey M=new Monkey();		
		M.sound();
		
	}

}
