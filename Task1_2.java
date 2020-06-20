package pgo9;

public class Task1_2 {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.start();
		car.stop();
	}
}

class Car extends Vehicle {
	private int numOfSeats;
	
	public int getNumOfSeats() {
		return numOfSeats;
	}
	
	@Override
	public void start() {
		System.out.println("Car Started");
	}
	
	@Override
	public void stop() {
		System.out.println("Car Stopped");
	}
}

class Vehicle {
	public void start() {
		System.out.println("Vehicle Started");
	}
	
	public void stop() {
		System.out.println("Vehicle Stopped");
	}
}
