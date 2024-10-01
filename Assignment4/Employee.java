/*3.    Write a program by creating an 'Employee' class having the following methods and print the final salary.
a.    'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
b.    'AddSal()' which adds $10 to salary of the employee if it is less than $500.
c.    'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.*/
package Assignment4;

public class Employee {
			private double salary;
			private double hrs;
			
		public void getInfo(double salary,double hrs) {
			this.salary=salary;
			this.hrs=hrs;
		}
		public void AddSal() {
			if(salary<500) {
				salary+=10;
		
			}
		}
		public void AddWork() {
			if(hrs>6)
				salary+=5;
		}
		@Override
		public String toString() {
			return "Employee [salary=" + salary + ", hrs=" + hrs + "]";
		}
		
}
