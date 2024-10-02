/*3.Create a class 'Student' with three data members which are name,
age and address. The constructor of the class assigns default values
name as "unknown", age as '0' and address as "not available". It has two
Members with the same name 'setInfo'. First method has two
parameters for name and age and assigns the same whereas the second
method takes has three parameters which are assigned to name, age and
address respectively. Print the name, age and address of 10 students.
Hint-Use array of objects.*/
package assignment5;

public class Student {
	private String name;
	private int age;
	private String address;
	
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public void setInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
}
