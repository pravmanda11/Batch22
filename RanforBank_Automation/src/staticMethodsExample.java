

public class staticMethodsExample {  // Class Name Declaration
	
	int X= 200; //  Instance Variable, Obj Needed to access
	static int Y = 200; // Static Variable, Class is fine
	
	public static void add() {  //Static Method, Class is fine
		int A=10;   // Local Variable, Cannot used outside
		int B=20; // Local Variable, Cannot used outside
		
		System.out.println(A+B);
	}
	
	public static void sub() { //Static Method, Class is fine
		int A=10; // Local Variable, Cannot used outside
		int B=20; // Local Variable, Cannot used outside
		
		System.out.println(B-A);
	}
	
	public void div() {  //Non-Static Method, Obj  Needed to access
		int A=20;// Local Variable, Cannot used outside
		int B= 5;// Local Variable, Cannot used outside
		System.out.println(B/A);
	}


	public static void main(String[] args) {  // Main Method, Execution starts from here by JVM
		
		staticMethodsExample obj = new staticMethodsExample(); // Object Creation 
		
		obj.div();
		staticMethodsExample.add();
		staticMethodsExample.sub();
	
	}

}
