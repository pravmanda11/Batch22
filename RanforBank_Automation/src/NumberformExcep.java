
public class NumberformExcep {

	public static void main(String[] args) {

		try {
			String age = "123ABs";
			int V = Integer.parseInt(age); // 123 Exception....
			System.out.println(V);
		} catch (NumberFormatException s) {
			System.out.println("There is an exception occuered");
		}

		int A = 100;
		int B = 200;

		System.out.println(A + B);

		int X = 100;
		int Y = 200;

		System.out.println(Y - X);

	}

}
