package oOPSJava;

public class finalizeEx {

	int A = 10;
	int B = 20;

	public static void main(String[] args) {

		finalizeEx obj = new finalizeEx();
		finalizeEx obj1 = new finalizeEx(); // System memory waste ...object ...garbage
		finalizeEx obj2 = new finalizeEx();

		System.out.println(obj.A);
		System.out.println(obj.B);

		obj = null;  //Clearing the object garbage .... 
		obj1 = null;
		obj2 = null;

	}

}
