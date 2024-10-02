package assignment5;

public class Employee extends Person{
	protected int sal;
	public void work() {
		System.out.println("working.............");
	}
	
	public int getSalary() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	
}
