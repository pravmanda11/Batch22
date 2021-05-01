package myPackages;

public class debuggingzExample {

	public void sub() {
		int X = 200;
		int Y = 20;
		System.out.println(X - Y);

	}

	public void mul() {
		int M = 100;
		int N = 5;
		System.out.println(M * N);
	}

	public static void main(String[] args) {

		debuggingzExample  obj = new debuggingzExample();
		int A = 10; // A=10
		int B = 20; // B=20
		int C = A + B; // C=30

		if (C == 300) {
			System.out.println("Addition is correct");
		} else {
			System.out.println("Addition is incorrect");
		}
		
		obj.sub();
		obj.mul();

	}

}
