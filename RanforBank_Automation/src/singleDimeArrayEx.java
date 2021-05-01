
public class singleDimeArrayEx {

	public static void main(String[] args) {

		// one Dimensional Array

		int X[] = new int[5];

		X[0] = 10;
		X[1] = 20;
		X[2] = 30;
		X[3] = 40;
		X[4] = 50;
		
		int l = X.length;  //5
		
		for (int i = 0; i < l; i++) {
			System.out.println(X[i]); // 10,20,30,40,50
		}

	}

}
