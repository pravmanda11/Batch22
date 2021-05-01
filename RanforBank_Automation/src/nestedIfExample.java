
public class nestedIfExample {

	public static void main(String[] args) {

		int A = 10;
		int B = 20;
		int C, D;

		C = A * B; // 200
		D = B - A; // 10

		if (C == 200) { // start

			if (D == 100) {
				System.out.println("Multiplication & Subraction is correct");
			} else {
				System.out.println("D is incorrect");
			}

		} else {
			System.out.println("C is in correct");
		}

	}

}
