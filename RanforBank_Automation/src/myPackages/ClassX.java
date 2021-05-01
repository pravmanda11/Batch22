package myPackages;

public class ClassX {

	public int C = 20; // Anywhere in project
	protected int A = 10; // With in package, outside package in case of inher
	int B = 20; // With in package
	private int D = 30; // with in class

	protected void add() {
		System.out.println(A + B);
	}

	public void sub() {
		System.out.println(B - A);
	}

}
