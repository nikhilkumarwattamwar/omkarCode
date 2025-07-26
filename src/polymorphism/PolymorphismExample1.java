//it is a run time and compile time polymorphism example
package polymorphism;
class Animal {
 void sound() {
     System.out.println("Animals sound");
 }
}

class Dog extends Animal {
 @Override
 void sound() {
     System.out.println("Dog sound");
 }
}

class Cat extends Animal {
 @Override
 void sound() {
     System.out.println("Cat sound");
 }
}

public class PolymorphismExample1 {
	    void display(int num) {
	        System.out.println("Display method calling with value :" + num);
	    }

	    void display(String message) {
	        System.out.println("Display method calling with string: " + message);
	    }

	    public static void main(String[] args) {
	       
	        Animal myAnimal = new Animal();
	        Animal myDog = new Dog();
	        Animal myCat = new Cat();

	        myAnimal.sound(); 
	        myDog.sound(); 
	        myCat.sound(); 

	        PolymorphismExample1 example = new PolymorphismExample1();
	        example.display(100);
	        example.display("Hello programming");
	    }

}
