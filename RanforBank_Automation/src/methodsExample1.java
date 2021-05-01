

public class methodsExample1 {
	
	static int X= 20; // out side main method and with static keyword, Required class name to access, object is not necessary 
	int A=10;      // instance = outside main method and without static, Requires OBj help to call
	int B =20;
	

	public void add() {
		int X = 10;  //local variables -you cannot use it out side of this method
		int Y = 20;
		
		System.out.println(X + Y);
	}

	public void subract() {
		int X = 100; //local variables
		int Y = 200;
		System.out.println(Y - X);

	}

	public void div() {
		int X = 20;  // local varibale
		int Y = 200;
		System.out.println(X * Y);
	}

	public static void main(String[] args) {

		methodsExample1  obj = new methodsExample1();
		obj.add();
		obj.subract();
		obj.div();
	}

}
