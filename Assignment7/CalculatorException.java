package JavaAssignment7;

import java.util.*;

class calculator extends Exception {
	int num1, num2;


	public void add(int num1, int num2) {
		System.out.println("Addition: " + (num1 + num2));
	}

	public void sub(int num1, int num2) {
		System.out.println("Subtraction: " + (num1 - num2));
	}

	public void mul(int num1, int num2) {
		System.out.println("Multiplication: " + (num1 * num2));
	}

	public void div(int num1, int num2) {
		System.out.println("Division: " + (num1 / num2));
	}

}

public class CalculatorException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		calculator cal = new calculator();
		try {
			String str, str1, str2;
			int num1, num2;
			
			do {
				System.out.println(".......Calculator.......");
				System.out.println("1. Addition");
				System.out.println("2. Subtraction");
				System.out.println("3. Multiplication");
				System.out.println("4. Division");
				System.out.println("5. Exit");

				System.out.println("-----------------------");
				System.out.println("Enter choice: ");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println("------------------------------");
					System.out.println("Enter the num1: ");
					str1 = sc.next();
					System.out.println("Enter the num2: ");
					str2 = sc.next();
					System.out.println("------------------------------");

					num1 = Integer.parseInt(str1);
					num2 = Integer.parseInt(str2);
					
					if(num1<0 || num2<0) {
						throw new ArithmeticException("Enter positive number");
					}
					else {
						cal.add(num1, num2);
					}
					
					break;
				case 2:
					System.out.println("------------------------------");
					System.out.println("Enter the num1: ");
					str1 = sc.next();
					System.out.println("Enter the num2: ");
					str2 = sc.next();
					System.out.println("------------------------------");
					num1 = Integer.parseInt(str1);
					num2 = Integer.parseInt(str2);
					if(num1<0 || num2<0) {
						throw new ArithmeticException("Enter positive number");
					}
					else {
						cal.sub(num1, num2);
					}
					
					break;
				case 3:
					System.out.println("------------------------------");
					System.out.println("Enter the num1: ");
					str1 = sc.next();
					System.out.println("Enter the num2: ");
					str2 = sc.next();
					System.out.println("------------------------------");
					num1 = Integer.parseInt(str1);
					num2 = Integer.parseInt(str2);
					
					if(num1<=0 || num2<=0) {
						throw new ArithmeticException("Enter positive number");
					}
					else {
						cal.mul(num1, num2);
					}
					
					break;
				case 4:
					System.out.println("------------------------------");
					System.out.println("Enter the num1: ");
					str1 = sc.next();
					System.out.println("Enter the num2: ");
					str2 = sc.next();
					System.out.println("------------------------------");
					num1 = Integer.parseInt(str1);
					num2 = Integer.parseInt(str2);
					
					if(num1<=0 || num2<=0) {
						throw new ArithmeticException("Can't divided by zero");
					}
					else {
						cal.div(num1, num2);
					}
					
					break;
				case 5:
					System.exit(choice);
				default:
					System.out.println("Thanks...");
				}

				System.out.println("Do you want to continue (y/n): ");
				str = sc.next();

			} while (str.equalsIgnoreCase("y"));
			sc.close();
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

	}

}
