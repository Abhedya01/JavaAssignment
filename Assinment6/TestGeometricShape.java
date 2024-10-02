package Assinment6;

abstract class GeometricShape {

	abstract public void area();

	abstract public void perimeter();

}

class Circle extends GeometricShape {

	protected int radius;

	static double PI = 3.14;

	public Circle(int radius) {

		this.radius = radius;

	}

	@Override

	public void area() {

		double result = PI * radius * radius;

		System.out.println("Area of circle " + result);

	}

	@Override

	public void perimeter() {

		double result = 2 * PI * radius;

		System.out.println("Perimeter " + result);

	}

}

class Rectangle extends GeometricShape {

	protected int length;

	protected int breadth;

	public Rectangle(int length, int breadth) {

		this.length = length;

		this.breadth = breadth;

	}

	@Override

	public void area() {

		double result = length * breadth;

		System.out.println("Area of circle " + result);

	}

	@Override

	public void perimeter() {

		double result = 2 * (length + breadth);

		System.out.println("Perimeter " + result);

	}

}

class Triangle extends GeometricShape {

	protected int base;

	protected int height;

	protected int side;

	public Triangle(int base, int height) {

		this.base = base;

		this.height = height;

	}

	@Override

	public void area() {

		double result = 0.5 * base * height;

		System.out.println("Area of circle " + result);

	}

	@Override

	public void perimeter() {

		double result = side + base + height;

		System.out.println("Perimeter " + result);

	}

}

public class TestGeometricShape {

	public static void main(String[] args) {

		Circle circle = new Circle(3);

		circle.area();

		circle.perimeter();

		System.out.println("=================================");

		Rectangle rectangle = new Rectangle(3, 4);

		rectangle.area();

		rectangle.perimeter();

		System.out.println("=================================");

		Triangle triangle = new Triangle(3, 4);

		triangle.area();

		triangle.perimeter();

	}

}
