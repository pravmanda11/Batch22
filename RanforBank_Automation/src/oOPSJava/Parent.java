package oOPSJava;

public class Parent {

	public void hello() {
		System.out.println("Hello method from parent");
	}
	
	public static void main(String[] args) {

		final int A = 10; //We cannot change the value
		//A = 20;
		//A = 30;
		
		System.out.println(A);

	}

}
