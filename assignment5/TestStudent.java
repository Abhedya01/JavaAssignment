package assignment5;
import java.util.Scanner;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student[] student = new Student[3];
		String name;
		int age;
		String address;
		for(int i = 0; i<student.length; i++) {
			name = sc.next();
			age = sc.nextInt();
			address = sc.next();
			student[i] = new Student(name, age, address);
		}
		for(int i = 0; i<student.length; i++) {
			System.out.println(student[i]);
		}
		sc.close();
	}

}
