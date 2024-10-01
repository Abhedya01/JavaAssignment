package Assignment4;

public class SavingAccount {
   private static  double ROI=0.010;
    private double balance;
    private double monthlyinterest;
    private double Total_balance;
    
    public SavingAccount() {
    	balance=0;
    }
    public void calculateMonthlyInterest() {
    	 monthlyinterest=(balance*ROI)/12;
    	 Total_balance=balance+monthlyinterest;
    	 
    }
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	   public static void modifyInterestRate(double newRate) {
	        ROI = newRate;
	    }
	@Override
	public String toString() {
		return "SavingAccount [balance=" + balance + ", monthlyinterest=" + monthlyinterest +",Total_balance="+Total_balance+ "]";
	}
	 
    
    
}
