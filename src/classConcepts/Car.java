package classConcepts;

public class Car {
	
	//instance variables
	String name;
	String model;
	int prize;
	
	//class variables
	static final int wheels = 4; //Object do not hold static variables
	

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.model = "S100";
		c1.prize = 50;
		
		System.out.println(c1.name + " " + c1.model + " " + c1.prize + " " + Car.wheels);
		
	}

}
