package myPackages;

public class ClassB {

	int A = 100;
	int B = 200;
	static int C = 100;
	static int D = 200;

	public void add() {
		System.out.println("from class B");
		System.out.println(A + B);
	}

	public static void sub() {
		System.out.println("from class B");
		System.out.println(D - C);
	}

	public static void main(String[] args) {

		ClassA objA = new ClassA();

		objA.add();
		objA.sub();
		
		
		ClassB objB = new ClassB();
		objB.add();
		objB.sub();
		
		

	}

}
