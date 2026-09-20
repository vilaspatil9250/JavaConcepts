package OOPS_Inheritance;

public class Vehicle extends Automobile {
	public void gear() {
		System.out.println("Vehicle - gears");
	}

	public final void registration() {
		System.out.println("Vehicle - unique chassis number");
	}

}
