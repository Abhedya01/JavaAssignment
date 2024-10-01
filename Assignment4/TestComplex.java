//2.Print the sum, difference and product of two complex numbers by creating 
//a class, named 'Complex' with separate methods for each operation whose real and 
//imaginary parts are entered by user. Use Constructors to initialize
//the data members.
package Assignment4;

public class TestComplex {

	public static void main(String[] args) {
		Complex complex = new Complex(23, 32);
		Complex complex1 = new Complex(34, 54);
		complex.display(complex, complex1);
	}

}
