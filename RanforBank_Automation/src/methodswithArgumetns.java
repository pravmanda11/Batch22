
public class methodswithArgumetns {

	public void add() {
		int A = 10;
		int B = 20;
		System.out.println(A + B);
	}

	public void sub(int A, int B, int C) {
		A = 100;
		B = 200;
		C = 300;
		System.out.println(A + B + C);  //600
	} 

	public static void main(String[] args) {

		methodswithArgumetns obj = new methodswithArgumetns();

		obj.add();
		obj.sub(10, 20, 30); // 60

	}

}
