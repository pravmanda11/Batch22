
public class ifelseifExample2 {

	public static void main(String[] args) {

		// if the number is in between 1 and 100 then display "number is smaller"
		// if the number is in between 101 and 1000 then display "number is medium"
		// if the number is more than 1000 then display "number is High"
		// if nothing is matching then display "zero or Negative"

		int a = -1590;

		if ((a >= 1) && (a <= 100)) {

			System.out.println("number is smaller");

		} else if ((a > 100) && (a < 1001)) {
			System.out.println("number is medium");

		}

		else if (a > 1000) {
			System.out.println("number is high");
		} else {
			System.out.println("number is Zero or Negative");
		}

	}

}
