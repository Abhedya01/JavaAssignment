package Assignment4;
import java.util.*;
public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double sal;
		sal=sc.nextDouble();
		double hrs;
		hrs=sc.nextDouble();
		Employee e=new Employee();
		e.getInfo(sal, hrs);
		e.AddSal();
		e.AddWork();
		System.out.println(e);
		

	}

}
