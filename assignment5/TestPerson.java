package assignment5;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setSal(546789);
		System.out.println("Employee Salary "+employee.getSalary());
		
		HRManager hrmanager = new HRManager();
		hrmanager.work();
		hrmanager.addEmployee();
	}

}
