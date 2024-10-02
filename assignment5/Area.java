/*2.Create a class to print the area of a square and a rectangle.
The class has two methods ‘printArea’ and ‘printPerimeter’ with the
same name but different number of parameters. The method for printing
area of Rectangle has two parameters which are length and breadth
respectively while the other method for printing area of square has
one parameter which is side of square.*/


package assignment5;

public class Area {
	private int length;
	private int breadth;
	private int side;
	public Area(int length, int breadth, int side) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.side = side;
	}
	
	public void printArea() {
		System.out.println("Area of square = "+side*side);
		System.out.println("Area of Rectangle = "+length*breadth);
	}
	
	public void printPerimeter() {
		System.out.println("Perimeter of Square = "+4 * side);
		System.out.println("Perimeter of Rectangle = "+(2*length)+(2*breadth));
	}
}
