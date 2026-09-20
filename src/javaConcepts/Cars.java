package javaConcepts;

public class Cars {
	
	//non static variables/ instance variables
	String brand;
	String model;
	int price;
	
	//class variable / static variable >> Object will never hold any static variable 
	//static variable stored in CMA (Common Memory allocation >> Permanent Generation (till jdk 1.7) or MetaSpace (from jdk 8)
	//final variable are constant - value can not changed once declared
	static final int wheels = 4;

	public static void main(String[] args) {

		Cars c1 = new Cars();
		c1.brand = "BMW";
		c1.model = "A10";
		c1.price = 40;
		
		Cars c2 = new Cars();
		c2.brand = "Audi";
		c2.model = "A20";
		c2.price = 50;
		
		Cars c3 = new Cars();
		c3.brand = "Volvo";
		c3.model = "v30";
		c3.price = 60;
					
		System.out.println("Fisrt Car = " + c1.brand + " " + c1.model + " " + c1.price + " " + Cars.wheels);
		System.out.println("Second Car = " + c2.brand + " " + c2.model + " " + c2.price + " " + Cars.wheels);
		System.out.println("Third Car = " + c3.brand + " " + c3.model + " " + c3.price + " " + Cars.wheels);

		//local variable - can not be static. It can be final
		final int a = 10;
		
	}

}
