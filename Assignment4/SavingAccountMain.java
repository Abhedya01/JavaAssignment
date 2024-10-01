package Assignment4;
import java.util.Scanner;
public class SavingAccountMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double bal;
		bal=sc.nextDouble();
		SavingAccount s=new SavingAccount();
		s.setBalance(bal);
		s.calculateMonthlyInterest();
		System.out.println(s);
		System.out.println("=========================================");
		SavingAccount s1=new SavingAccount();
		s1.setBalance(900000);
		s1.calculateMonthlyInterest();
		System.out.println(s1);
		System.out.println("=========================================");
		SavingAccount s2=new SavingAccount();
		s2.modifyInterestRate(0.04);
		s2.setBalance(900000);
		s2.calculateMonthlyInterest();
		System.out.println(s2);
		System.out.println("=========================================");
		
		
		
	}

}
