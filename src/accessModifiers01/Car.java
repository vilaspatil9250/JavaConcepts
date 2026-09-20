package accessModifiers01;

public class Car extends Vehicle{
	
	@Override //default method can be overridden as default, protected and public
	protected void fuel() {
		System.out.println("Car - Fuel");
	}
	
	//This is not Override method as private method is not participating in this.
	private void engine() {
		System.out.println("Car - Engine");
	}
	
	@Override //Protected method can be overriden as protcted and public
	public void lock(){
		System.out.println("Car - Lock");
	}
	
	
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.fuel();
		c1.engine();
		c1.lock();
		c1.start();

	}

}
