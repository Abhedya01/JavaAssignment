package assignment5;

public class BankA extends Bank {
	protected double balance;
	
	public BankA(double balance) {
		super(balance);
		this.balance = balance;
	}
	public double applyInterest() {
		double accountBalance = this.balance + balance * interestRate;
		return accountBalance;
	}
}
