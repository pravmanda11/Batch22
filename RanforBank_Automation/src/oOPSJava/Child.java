package oOPSJava;

public class Child extends Parent {

	public void hello() {
		System.out.println("Hello method from child");
	}

	public static void main(String[] args) {

		Child obj = new Child();
		obj.hello();
	}

}
