
public class switchCaseExample {

	public static void main(String[] args) {

		char Rank = 'E';

		switch (Rank) {

		case 'A':
			System.out.println("Passed in First Class");
			break;

		case 'B':
			System.out.println("Passed in Second Class");
			break;

		case 'C':
			System.out.println("Passed in Third Class");
			break;

		case 'D':
			System.out.println("Promoted Just");
			break;

		default:
			System.out.println("Failed");
		}
	}

}
