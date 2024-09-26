//Assignment 5: Job Application
//Write a program that checks if a person is eligible for a job based 
//on their qualifications. A person is eligible if they have a bachelor’s degree 
//or equivalent experience, and they have a clean criminal record.
//Requirements:
//•    Use logical operators to combine conditions.

package assignment;

import java.util.Scanner;

public class JobApplication {
private boolean degree;
private boolean experience;
private boolean record;

Scanner sc = new Scanner(System.in);

void set() {
    System.out.println("Do have a bachelor's degree or no ");
    String input = sc.next();
    degree = input.equals("yes");
    System.out.println("Do have a  equivalent experience");
    String Input = sc.next();
    experience = Input.equals("yes");
    System.out.println("Do you have a clean criminal record");
    String Record = sc.next();
    record = Record.equals("no");
}
void check() {
	 if((degree || experience) && record) {
		  System.out.println("person is eligible for a job ");
	  }else {
		  System.out.println("person is not eligible for a job ");
	  }
}
	public static void main(String[] args) {
		JobApplication j = new JobApplication();
		j.set();
		j.check();
	}

}