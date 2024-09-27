package Patterns;
//0 0 X 0 0 
//0 0 X 0 0 
//X X X X X 
//0 0 X 0 0 
//0 0 X 0 0 
public class Pattern15 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if((i==3 || j==3) )
					System.out.print("X ");
				
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}
