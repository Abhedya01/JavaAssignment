package Patterns;
import java.util.*;
public class Pattern3 {
//	Enter the num: 4
//	A B C D E 
//	B C D E F 
//	C D E F G 
//	D E F G H 
//	E F G H I 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=sc.nextInt();
		
		char ch='A';
		for(int i=0;i<=n;i++) {
			for(int j=0; j<=n; j++) {
				System.out.print((char)+(ch+i+j)+" ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
