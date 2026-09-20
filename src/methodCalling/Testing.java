package methodCalling;

public class Testing {
	//Calling non static method inside static method 
	//To call non static method, we need object reference
	//So passing object reference in Static method and calling non static method inside static method
	
	public void m1(Testing obj1) {
		System.out.println("Method m1");
		Testing.t1(obj1); //call by reference
	}

	public void m2() {
		System.out.println("Method m2");
	}
	
	public static void t1(Testing obj2) {
		System.out.println("Method t1");
		Testing.t2(obj2); //call by reference
	}
	
	public static void t2(Testing obj3) {
		System.out.println("Method t2");
		obj3.m2(); 
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		Testing obj = new Testing();
		obj.m1(obj); //call by reference

	}

}
