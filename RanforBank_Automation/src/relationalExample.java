
public class relationalExample {

	public static void main(String[] args) {

		int A = 10;
		int B = 20;
		int C = 5;
		int D = 20;

		System.out.println(A == D); // False
		System.out.println(B == D); // True
		System.out.println(A != C); // True
		System.out.println(B != D); // False
		System.out.println(A > C); // true
		System.out.println(B < C); // false
		System.out.println(D >= B); // true
		System.out.println(A<=D);  //true
	}

}
