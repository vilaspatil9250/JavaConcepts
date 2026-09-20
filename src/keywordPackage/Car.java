package keywordPackage;

public class Car {
	
	int speed = 100;
	
	public Car() {
		this(111);
		System.out.println("Car - Default constructor.");
	}
	
	public Car(int a) {
		this(111, 222);
		System.out.println("Car - 1 parameter constructor: "+ a);
	}
	
	public Car(int a, int b) {
		System.out.println("Car - 2 Parameter constructor: " + a + ", "+ b);
	}
	
	public void start() {
		System.out.println("Car - Start method");
	}
	
	public void stop() {
		System.out.println("Car - Stop method");
	}

}
