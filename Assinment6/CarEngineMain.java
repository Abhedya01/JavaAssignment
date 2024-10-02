package Assinment6;

class Engine {

	private String engineName;

	private int engineNumber;

	public Engine(String engineName, int engineNumber) {

		super();

		this.engineName = engineName;

		this.engineNumber = engineNumber;

	}

	public void displayEngine() {

		System.out.println("Engine name is " + engineName + " and engine number is" + engineNumber);

	}

}

class Car {

	private String carName;

	private String color;

	public Car(String carName, String color) {

		super();

		this.carName = carName;

		this.color = color;

	}

	public void displayCar() {

		System.out.println("car name is " + carName + "and color is " + color);

	}

	public void startCar() {

		System.out.println("car Started");

	}

	public void StopCar() {

		System.out.println("Car Stopped");

	}

}

public class CarEngineMain {

	public static void main(String[] args) {

// TODO Auto-generated method stub

		Engine engine = new Engine("V8", 480);

		engine.displayEngine();

		System.out.println("===========================");

		Engine engine1 = new Engine("330i", 480);

		engine1.displayEngine();

		System.out.println("===========================");

		Car car = new Car("Ford", "red");

		car.displayCar();

		car.startCar();

		car.StopCar();

		System.out.println("===========================");

		Car car1 = new Car("Verna", "black");

		car1.displayCar();

		car1.startCar();

		car1.StopCar();

	}

}