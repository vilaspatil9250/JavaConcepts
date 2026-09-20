package OOPS_Inheritance;

public class Car extends Vehicle{
	
	int speed = 80;
	
	public void start() {
		System.out.println("Car - starte");
	}
	
	public void stop() {
		System.out.println("Car - stop");
	}
	
	public void refuel() {
		System.out.println("Car - refuel");
	}

	//final method - can not be overriden
	public final void safety() {
		System.out.println("Car - safety guidelines");
	}
	
	//static menthod - same static menthod can be have in Child class. It is called as method hiding
	public static void airpressure() {
		System.out.println("Car airpressure - 32");
	}
	
	//Private method - can not be inherited
	//This cannot be access directly outside of this class.
	//To use private method outside of this class - Encapsulation concept is used.
	private void locking() {
		System.out.println("Car - lock system");
	}
	
	//Encapsulation - Private method incapsulated in Public method, so we can use it's features outside of this class
	public void CarLocking() {
		locking();
	}
	
	
	
}
