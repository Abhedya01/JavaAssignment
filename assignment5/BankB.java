package assignment5;

public class BankB extends Bank{
	protected double balance;
	
	public BankB(double balance) {
		super(balance);
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public double applyInterest() {
		double accountBalance = this.balance + this .balance * interestRate;
		return accountBalance;
	}
}
