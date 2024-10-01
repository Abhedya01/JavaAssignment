package Assignment4;

public class AreaOfTriangle {
	private float a;
	private float b;
	private float c;
	private float area;
	private float peri;
	
	public AreaOfTriangle() {
		a=3;
		b=4;
		c=5;
				
	}
	public void area() {
		area=(float) (0.5*a*b);
	}
	public void perimeter() {
		peri=a+b+c;
	}
	public void display() {
		System.out.println("Area of Triangle is:"+area);
		System.out.println("perimeter of Triangle"+peri);
	}
	public static void main(String[] args) {
		AreaOfTriangle t1=new AreaOfTriangle();
		t1.area();
		t1.perimeter();
		t1.display();
		

	}

}
