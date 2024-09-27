package Patterns;
//1 2 3 4 5 6 
//2 3 4 5 6 
// 3 4 5 6 
//  4 5 6 
//   5 6 
//    6 
public class Pattern14 {
	public static void main(String[] args) {
		int n=1;
		for(int i=0;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=5-i;j++) {
				System.out.print(n+i+j +" ");
				
			}
			
			System.out.println();
		}
	}
}
