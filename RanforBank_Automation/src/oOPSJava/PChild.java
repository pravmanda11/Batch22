package oOPSJava;

public class PChild extends Praveen{

	String S = "ChildTesting";
	int dur = 40;

	public void display() {
		System.out.println(this.S); // Access Current child class Instance Variables
		System.out.println(this.dur);
		System.out.println(super.S); // Super : Access Parent Class Instance Variables
		System.out.println(super.dur);
	}

	public static void main(String[] args) {

		PChild obj = new PChild();

		obj.display();

	}

}
