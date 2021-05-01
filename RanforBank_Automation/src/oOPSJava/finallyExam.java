package oOPSJava;

public class finallyExam {

	public static void main(String[] args) {

		try {
			int A = 100;
			System.out.println(A / 0);
		} catch (Exception e) {
			System.out.println(e);
		}

		finally {
			int C = 200;
			int B = 100;
			System.out.println(C + B);
		}
	}
	

}
