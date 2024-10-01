/*5.    Write a program that has variables to store Car data like;CarModel, CarName, CarPrice and 
 * CarOwner. The program should include functions to assign user defined values to the above mentioned
 *  variable and a display function to show the values. Write a main that calls these functions.
 *  Now write another runner class that declares three Car objects and displays the data of all three.
 */


package Assignment4;

public class CarData {
	private String CarName;
	private int CarModel;
	private double CarPrice;
	private String CarOwner;
	
	public CarData(String CarName,int CarModel,double CarPrice,String CarOwner) {
		this.CarName=CarName;
		this.CarModel=CarModel;
		this.CarPrice=CarPrice;
		this.CarOwner=CarOwner;
	}
	public void display() {
		System.out.println("CarName :"+CarName);
		System.out.println("CarModel :"+CarModel);
		System.out.println("CarPrice :"+CarPrice);
		System.out.println("CarOwner :"+CarOwner);
	}

}
