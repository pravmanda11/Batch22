package oOPSJava;

public class Students {

	int id;  //Instance variables
	String name;

	Students(int i, String S) {  //Parametrized Constructor
		id = i;
		name = S;
	}

	public void displaydata() {  //Normal Method
		System.out.println(id + "  " + name);

	}

	public static void main(String[] args) {
		Students s = new Students(111, "Praveen");
		s.displaydata();

	}

}
