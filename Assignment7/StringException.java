package JavaAssignment7;
import java.util.*;
public class StringException {
//4.Write a program to read a string and convert to integer using try catch block
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter the string: ");
			String str=sc.next();
			int result=Integer.parseInt(str);
			System.out.println(result);
			
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}

	}

}
