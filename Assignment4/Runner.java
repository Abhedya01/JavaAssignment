package Assignment4;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarData c=new CarData("Toyota" , 2020, 24000.00,"Shree");
		c.display();
		System.out.println("===========================================");
		CarData c1=new CarData("Mustang", 2021, 35000.00,"Bhushan");
		c1.display();
		System.out.println("===========================================");
		CarData c2=new CarData("Honda", 2019, 22000.00, "Neelya");
		c2.display();
	}

}
