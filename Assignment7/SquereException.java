package JavaAssignment7;

import java.util.*;
public class SquereException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter the no: ");
			String str=sc.next();
			
			
			int result=Integer.parseInt(str);
			int squere=result*result;
			System.out.println("Squere is: "+ squere);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		finally {
			sc.close();
		}
	}

}
