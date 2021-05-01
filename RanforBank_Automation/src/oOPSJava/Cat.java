package oOPSJava;

public class Cat extends Animal {

	public void eat() {
		System.out.println("I am eat method from Cat class");
	}

	public static void main(String[] args) {
		
		Animal A = new Animal();
		A.eat();   //Animal is eating
		
		Cat C = new Cat();
		C.eat();   //Cat is eating
		

	}

}
