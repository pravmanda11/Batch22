
public class arrayOutExcpetion {

	public static void main(String[] args) {

	/*	try {
			int[] x = new int[3];

			x[0] = 10;
			x[1] = 20;
			x[2] = 30;
			x[3] = 10;
			System.out.println(x[3]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is not in range so exception occured");
		}
		
		int A= 10;
		System.out.println(A);*/
		
		try {
		int A = 10;
		int B = 0;
		System.out.println(A/B);
		}
		catch(ArithmeticException e) {
			System.out.println("excpetion occered ...");
		}
		
		
		
		
		

	}

}
