package OOPS_Inheritance;

public class BMW extends Car{
	
	//Method override concept not applicable for variables
	int speed = 120;
	
	//Method Overriding - This is used in inheritance
	//Type of Polymorphism - Run time PM/Dynamic PM
	//when Parent class method - same method available in Child class having
	//Same signature(same method name, same return type, same parameter, but can have different implementation inside it)
	//use @override annotation before these methods	
	//start() method overridden in child class
	
	@Override
	public void start() {
		System.out.println("BMW - Auto start");
	}
	
	public void autopart() {
		System.out.println("BMW - Auto parking");
	}
	
	//Static method can not be overriden 
	//allow same name as statuc method available in Parent class
	//This is called method hiding
	public static void airpressure() {
		System.out.println("Car airpressure - 35");
	}
	
	
	//HAS_A Relationship - 
	//Created Object of Truck Class and called it's Loading method
	public void carLoading() {
		Truck t1 = new Truck();
		t1.loading();
	}

}
