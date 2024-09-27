package Patterns;
import java.util.*;
public class Pattern16 {
//	0 X X X X X 
//	X 0 X X X X 
//	X X 0 X X X 
//	X X X 0 X X 
//	X X X X 0 X 
//	X X X X X 0 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i==j) )
					System.out.print("0 ");
				
				else {
					System.out.print("X ");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
