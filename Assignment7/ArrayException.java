package JavaAssignment7;

import java.util.*;
public class ArrayException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[4];
		
		try {
			
			System.out.println("Enter the array element: ");
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Array is: ");
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}
			
			System.out.println(arr[8]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

		sc.close();
		
		
	}

}
