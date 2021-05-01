package oOPSJava;

public class ChildClass extends ParentClass{
	
	int X = 10;
	int Y = 20;
	int Z = 30;
	
	public void name() {
		System.out.println("Hi i am praveen");
	}
	
	public void age() {
		System.out.println("Hi i am 10 yrs old");
	}
	
	public static void main(String[] args) {
	
		ChildClass obj = new ChildClass();
		
          obj.name();
          obj.age();
          obj.add();
          obj.sub();
          obj.mul();

	}

}
