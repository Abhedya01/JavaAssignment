package assignment5;

public class BankC extends Bank{
	protected double balance;
	
	public BankC(double balance) {
		super(balance);
		this.balance = balance;
	}
	
	public double applyInterest() {
		double accountBalance = balance + balance * interestRate;
		return accountBalance;
	}
}
