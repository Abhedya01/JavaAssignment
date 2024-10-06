package JavaAssignment7;

import java.util.*;

class stringValidate extends Exception {

	public stringValidate(String str) {

		super(str);

	}

}

public class VowelsException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");

		String str = sc.next();
		str.toLowerCase();
		int flag = 1;

		try {

			for (int i = 0; i < str.length(); i++) {
				
				if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
						|| str.charAt(i) == 'u') {
					flag = 1;
					break;
				}

				else {

					flag = 0;

				}

			}
			if (flag == 1) {
				System.out.println("String contain all vowels");
			} else {
				throw new stringValidate("String not conatain any vowels");
			}

		}

		catch (Exception e) {

			System.out.println(e);

		}

	}

}
