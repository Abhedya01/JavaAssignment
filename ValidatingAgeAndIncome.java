//Assignment 1: Validating Age and Income
//Write a program that checks if a person is eligible for a loan based on their age and income.
//Requirements:
//•    A person is eligible if their age is between 18 and 60 and their income is above $25,000.
//•    Use logical && to combine these conditions.

package assignment;

import java.util.Scanner;

public class ValidatingAgeAndIncome {
private int age ;
private double income;

Scanner sc = new Scanner(System.in);
void set() {
	System.out.println("Enter the age and income");
	age=sc.nextInt();
	income=sc.nextDouble();
}
void check() {
	if(age>=18 && age<=60 && income>25000) {
		System.out.println("Person is eligible for loan");
	}else {
		System.out.println("Person is not eligible for loan");

	}
}

public static void main(String args[]) {
	ValidatingAgeAndIncome v =new ValidatingAgeAndIncome();
	v.set();
	v.check();
}

}
