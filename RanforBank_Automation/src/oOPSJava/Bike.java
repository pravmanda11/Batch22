package oOPSJava;

abstract class Bike {
	
	public void add() {   // Normal Method wit declaration and also implementation code in it
		System.out.println("I am add method");
	}
	
	public abstract void sub();  //Abstract method will have only declaration, it will be implemented
	                            // when it is extended
	
	public abstract void mul();
	

	public static void main(String[] args) {
		
		//Bike obj = new Bike();  We can't create objec to abstract class

	}

}
