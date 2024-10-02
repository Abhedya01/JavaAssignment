package assignment5;

public class Bank {
	protected double balance;
	static double interestRate = 0.7;
	public Bank(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double applyInterest() {
		double accountBalance =this.balance + balance * interestRate;
		return accountBalance;
	}
}
