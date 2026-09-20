package keywordPackage;

public class Volvo extends Car {
	
	int speed = 200;
	
	public Volvo() {
		System.out.println("Volvo - Default Constructor.");
	}
	
	public Volvo(int a) {
		super(a);
		System.out.println("Volvo - 1 parameter constructor: "+ a);
	}
	
	public Volvo(int a, int b) {
		super(a, b);
		System.out.println("Volvo - 2 Parameter constructor: " + a + ", "+ b);
	}
	
	@Override
	public void start() {
		System.out.println("Volvo - Start Method");
	}

	public void features() {
		int carSpeed = super.speed;
		System.out.println("Car Speed = "+ carSpeed);
		System.out.println("Volvo Speed = "+ speed);
		super.start();
		start();
		stop();
	}
}
