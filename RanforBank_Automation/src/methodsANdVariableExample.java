

public class methodsANdVariableExample {

	int A = 200;
	int B = 20;

	public void add() {
		int X = 10;
		System.out.println(A + B);
	}

	public void sub() {
		int Y = 20;
		System.out.println(A - B);
	}

	public void mul() {
		int M = 100;
		System.out.println(A * B);
	}

	public static void main(String[] args) {
		methodsANdVariableExample obj = new methodsANdVariableExample();

		obj.add();
		obj.sub();
		obj.mul();

	}

}
