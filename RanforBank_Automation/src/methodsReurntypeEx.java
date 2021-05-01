
public class methodsReurntypeEx {

	public void add() { // Void keyword will take care of return type, no need to declare retun keyword
						// inside method
		int A = 10;
		int B = 20;
		System.out.println(A + B); // 30 returning the result = int ...
	}

	public int sub() { // if we are not using void in a method, we must declare datatype of method
						// returning
		int A = 100;
		int B = 300;
		return (B - A); // 200: return type : int
	}

	public static void main(String[] args) {
	
		methodsReurntypeEx obj = new methodsReurntypeEx();
		
		obj.add();
		obj.sub();

	}

}
