package Assinment6;

class A {

	public static void sum() {

		System.out.println("Parent");

	}

}

class B extends A {

	public static void add() {

		System.out.println("Child");

	}

}

public class classMain {

	public static void main(String[] args) {

// TODO Auto-generated method stub

		A obj = new B();

		A.sum();

		B.add();

	}

}