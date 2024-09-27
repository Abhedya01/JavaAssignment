package Patterns;

public class Pattern19 {

	public static void main(String[] args) {
//		for(int i=1;i<=7;i++) {
//			for(int j=1;j<=7;j++) {
//				if(i==1 || i==7 || j==1 || j==7) {
//					System.out.print("4 ");
//				}
//				else if(i==2 || i==6 || j==2 || j==6) {
//					System.out.print("3 ");
//				}
//				else if(i==3 || i==5 || j==3 || j==5) {
//					System.out.print("2 ");
//				}
//				else {
//					System.out.print("1 ");
//				}
//			}
//			System.out.println();
//		}
		int n = 7; // size of the pattern

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int min = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));
                System.out.print(4 - min + " ");
            }
            System.out.println();
        }

	}

}
