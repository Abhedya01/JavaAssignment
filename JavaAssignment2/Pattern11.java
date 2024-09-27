package Patterns;

import java.util.Scanner;

public class Pattern11 {
//	Enter the num: 5
//           1    
//         2    3    
//      4    5    6    
//   7    8    9    10    
//11    12    13    14    15  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=sc.nextInt();
		int star=1;
		int space=n-1;
		int a=1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=star;j++) {
				System.out.print(a+"    ");
				a++;
			}
			
			space--;
			star++;
			
			System.out.println();
		}
		sc.close();

	}

}
