package Assinment6;

abstract class Animal {

	abstract public void sound();

	public void move() {

		System.out.println("walk , run , eat and sleep");

	}

}

class Dog extends Animal {

	@Override

	public void sound() {

// TODO Auto-generated method stub

		System.out.println("the dog barks");

	}

	public void move() {

		System.out.println("hey im dog ,i can walk , run");

	}

}

class Cat extends Animal {

	public void sound() {

		System.out.println("i say meowwww");

	}

	public void move() {

		System.out.println("hey im cat and i can walk and run");

	}

}

class Bird extends Animal {

	public void sound() {

		System.out.println("i say kooooo");

	}

	public void move() {

		System.out.println("hey im cuckoo and i fly in the sky");

	}

}

public class TestAnimal {

	public static void main(String[] args) {

// TODO Auto-generated method stub

		Dog dog = new Dog();

		dog.move();

		dog.sound();

		System.out.println("=====================");

		Cat meow = new Cat();

		meow.move();

		meow.sound();

		System.out.println("=====================");

		Bird cuckoo = new Bird();

		cuckoo.move();

		cuckoo.sound();

	}

}