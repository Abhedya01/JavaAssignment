
package Assignment4;

public class Complex {
	private int real;
	private int imaginary;
	
	public Complex(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public void display(Complex complex, Complex complex1) {
		this.real = complex.real + complex1.real;
		this.imaginary = complex.imaginary+complex1.imaginary;
		System.out.println(this.real+" + "+this.imaginary+"i");
	}
}
