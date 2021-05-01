
public class concatExample {

	public static void main(String[] args) {

		String Fname = "Praveen";
		int age = 22;
		int ht = 6;
		String Lname = "Manda";

		System.out.println("Praveen" + 22 + 6 + "Manda"); // Praveen226Manda
		System.out.println(age + ht + Fname + Lname); // 28PraveenManda

		System.out.println(Fname + age); // Praveen22
		System.out.println(age + ht);

	}

}
