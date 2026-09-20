package constructorConcept;

public class Car {

	// AC: Create Class for Car having
	// Brand name, Model number
	// Brand name, model number, price
	// Brand name, model number, price, VIN
	// Brand name, Model number, price, VIN, Year

	// instance variables
	String brand;
	String model;
	int price;
	String vin;
	int year;

	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	public Car(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public Car(String brand, String model, int price, String vin) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.vin = vin;
	}

	public Car(String brand, String model, int price, String vin, int year) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.vin = vin;
		this.year = year;
	}

	public static void main(String[] args) {
		Car c1 = new Car("Audi", "A100");
		Car c2 = new Car("BMW", "S100", 45);
		Car c3 = new Car("Honda", "City", 23, "ABCD11223344");
		Car c4 = new Car("Toyota", "Glanza", 26, "XYZ99887766", 2020);

		System.out.println(c1.brand + "; " + c1.model);
		System.out.println(c2.brand + "; " + c2.model + "; " + c2.price);
		System.out.println(c3.brand + "; " + c3.model + "; " + c3.price + "; " + c3.vin);
		System.out.println(c4.brand + "; " + c4.model + "; " + c4.price + "; " + c4.vin + "; " + c4.year);
	}

}
