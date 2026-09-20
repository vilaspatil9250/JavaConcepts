package accessModifiers02;

import accessModifiers01.Vehicle;

public class Truck extends Vehicle{
	
	//default method fuel available in accessModifiers01 package is not accessible in this package
	void fuel() {
		System.out.println("Truck - Fuel");
	}
	
	private void engine() {
		System.out.println("Truck - Engine");
	}	

	public static void main(String[] args) {
		Truck t1 = new Truck();
		t1.fuel();
		t1.engine();
		t1.lock(); //Protected method of Parent class - Vehicle (available in different package)
		t1.start();//public method of Parent class - Vehicle (available in different package)
		

	}

}
