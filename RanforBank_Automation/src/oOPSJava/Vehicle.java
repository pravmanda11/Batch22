package oOPSJava;

public class Vehicle extends Bike {

	public void sub() {
		System.out.println("I am subract method ");

	}

	public void mul() {
		System.out.println("I am Mult methods");

	}

	public static void main(String[] args) {

		Vehicle obj = new Vehicle();
		
		obj.add();
		obj.sub();
		obj.mul();
		
		
	}

}
