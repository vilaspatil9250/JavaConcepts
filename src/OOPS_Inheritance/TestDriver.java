package OOPS_Inheritance;

public class TestDriver {

	public static void main(String[] args) {
		
		//Create Object of Child class 
		BMW b1 = new BMW();
		b1.engine(); //inherited from Grand Parent class - Automobile
		b1.gear(); //inherited from Grand Parent class - Vehicle
		b1.registration(); //inherited from Grand Parent class - Vehicle
		b1.start(); //overriden method
		b1.stop(); //inherited
		b1.refuel();
		b1.safety();
		b1.autopart();
		b1.airpressure();
		b1.carLoading();
		System.out.println(b1.speed);
		System.out.println("========================");
		
		//Create Child class object by Parent Class Reference variable
		//This is called Top/up casting
		//IS_A Relationship >> BMW is as Car
		Car c1 = new BMW();
		c1.engine();
		c1.gear();
		c1.registration();
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.autopart(); 
		//c1.carLoading();
		//autopark and carLoading methods of BMW class (child) is not accessible with Car class (Parent) reference variable as Reference check failed
		c1.refuel();
		c1.CarLocking();
		c1.safety();
		System.out.println(c1.speed);
		
		//Create parent class object by reference of Child class variable
		//This is called down casting - it is not allowed
		//BMW b2 = new Car(); >> compile time error will display
		//BMW b2 = (BMW) new Car(); >> this is allowed in compile time but will give ClassCastException - Runtime exception
				

	}

}
