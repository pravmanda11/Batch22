package oOPSJava;

public class classsample implements Bank, Car {

	public void add() {
		System.out.println("I am add method");
	}

	public void sub() {
		System.out.println("I am Sub method");
	}

	public void geras() {
		System.out.println("I am gear method");
	}

	public void breaks() {
		System.out.println("I am break method");
	}

	public static void main(String[] args) {

		classsample obj = new classsample();

		obj.add();
		obj.sub();

	}

	@Override
	public void FundTransfer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BankStatement() {
		// TODO Auto-generated method stub
		
	}

}
