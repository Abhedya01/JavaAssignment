package Patterns;

import java.util.Scanner;

public class Pattern17 {
//	Enter the no: 5
//	X 0 0 0 X 
//	0 X 0 X 0 
//	0 0 X 0 0 
//	0 X 0 X 0 
//	X 0 0 0 X 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no: ");
		int n=sc.nextInt();
		int k=n;
		for(int i=1;i<=n;i++,k--) {
			for(int j=1;j<=n;j++) {
				if((i==j || k==j) )
					System.out.print("X ");
				else {
					System.out.print("0 ");
				}
			}
			
			System.out.println();
		}
		sc.close();


	}

}
