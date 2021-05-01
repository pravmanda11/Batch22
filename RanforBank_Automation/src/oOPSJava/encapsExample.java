package oOPSJava;

public class encapsExample {

	private double balance; // i dont want show my balance to any others

	public double getBalance() {
		return balance;
	}

	public void Setbalance(double amount) {
		this.balance = this.balance + amount;
	}

	public static void main(String[] args) {

		encapsExample obj = new encapsExample();
		obj.getBalance();

	}

}
