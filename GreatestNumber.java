/*Assignment 8: Determine the Greatest Number Using Ternary Operator

Write a Java program to find the greatest number among three numbers using the ternary operator.

*Input: Three integer numbers from the user.
*Output: The greatest number among the three entered numbers.*/


package assignment;
import java.util.Scanner;  

public class GreatestNumber {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
  
        System.out.print("Enter first number: ");  
        int num1 = scanner.nextInt();  
        
        System.out.print("Enter second number: ");  
        int num2 = scanner.nextInt();  
        
        System.out.print("Enter third number: ");  
        int num3 = scanner.nextInt();  
        
         
        int greatest = (num1 > num2)  
                        ? (num1 > num3 ? num1 : num3)  
                        : (num2 > num3 ? num2 : num3);  
       
        System.out.println("The greatest number is: " + greatest);  

        
    }  
}