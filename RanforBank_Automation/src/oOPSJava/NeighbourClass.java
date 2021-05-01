package oOPSJava;

public class NeighbourClass extends ParentClass{
	
	int M = 10;
	int N =20;
	
	public void walk() {
		System.out.println("i walk at 5 AM");
	}

	public static void main(String[] args) {
		
		NeighbourClass  obj = new NeighbourClass();
		
		obj.walk();
	   
		
	}

}
