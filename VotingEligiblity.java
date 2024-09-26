//Assignment 4: Voting Eligibility
//Write a program that checks if a person is eligible to vote. A person can vote if
//they are a citizen and their age is 18 or above.
//Requirements:
//•    Use logical && to combine conditions, and ! to negate conditions if necessary.

package assignment;

import java.util.Scanner;

public class VotingEligiblity {
	private boolean citizen;
	private int age;

	Scanner sc = new Scanner(System.in);

	void set() {
		System.out.println("Enter the citizen and age");
		String checkcitizen = sc.next();
		citizen = checkcitizen.equals("india");
		age = sc.nextInt();

	}

	void check() {
		if (citizen && age >= 18) {
			System.out.println("You are eligible for vote");
		} else {
			System.out.println("You are not eligible for vote");
		}
	}

	public static void main(String[] args) {
		VotingEligiblity v = new VotingEligiblity();
		v.set();
		v.check();

	}

}