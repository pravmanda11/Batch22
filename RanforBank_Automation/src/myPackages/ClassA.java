package myPackages;   ///1st line of every class

public class ClassA {
	
	int A=10;
	int B=20;
	static int C = 30;
	static int D= 40;
	
	public void add() {             // non static method ...obj
	  System.out.println("from class A");
		System.out.println(A+B);
	}
	
	public static void sub() {       // class name 
		System.out.println("from class A");
		System.out.println(D-C);
	}
	

	public static void main(String[] args) {
	
		ClassA obj = new ClassA();
		obj.add();
		
		ClassA.sub();

	}

}
