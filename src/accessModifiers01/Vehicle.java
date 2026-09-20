package accessModifiers01;

public class Vehicle {

	// default
	void fuel() {
		System.out.println("Vehicle - fuel");
	}

	// private
	private void engine() {
		System.out.println("Vehicle - Engine");
	}

	protected void lock() {
		System.out.println("Vehicle - Lock");
	}

	public void start() {
		System.out.println("Vehicle - Start");
	}

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.fuel();
		v1.engine();
		v1.lock();
		v1.start();

	}

}
