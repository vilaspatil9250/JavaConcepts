package methodConcepts;

public class SuperMarket {
	
	
	//Caller method ------->   Called method : Rule
	//Static ---------> Static : no object creation. call by using class name
	//Non-Static ---------> Static : no object creation. call by using class name
	//Non-Static ---------> Non-Static : no object creation. directly call by method name.
	//Static ---------> Non-Static : Create object / call by reference 
	
	String productname;
	int price;
	
	public void dairyproducts() {
		productname = "milk";
		price = 45;
		System.out.println("dairy products:" + productname + " and price: " + price);
	}
	
	public void cosmetics() {
		productname = "shampoo";
		price = 90;
		System.out.println("cosmetics products:" + productname + " and price: " + price);	
	}
	
	public void stationary() {
		productname = "Pen";
		price = 10;
		System.out.println("stationary products:" + productname + " and price: " + price);
	}
	
	public static void packaging() { 
		System.out.println("All products packaging done.");
		
	}
	
	public static void billing(SuperMarket s2) {
		System.out.println("final billing:");
		s2.dairyproducts(); //static method calling non static method by object reference
		s2.cosmetics();     //static method calling non static method by object reference
		s2.stationary();    //static method calling non static method by object reference
		SuperMarket.packaging(); //static method calling static method by class name
	}
	

	public static void main(String[] args) {
		SuperMarket s1 = new SuperMarket();
		SuperMarket.billing(s1); //Call by reference - here reference of Obejct is passed as s1

	}

}
