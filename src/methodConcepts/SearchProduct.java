package methodConcepts;

public class SearchProduct {

	// This class contains multiple methods having same name
	// This is called Method overloading /Compile time polymorphism / Static polymorphism / static binding
	// this is achieved when more than 1 method with same name are present in same class but
	// different count of parameter or
	// same count of parameters but different sequence. Example: search(string, int) and search(int, string)
	//This does not consider return type of method. Means - when method having same parameter, but different return type, 
	//those methods will not qualify method overloading. Those methods will be considered as duplicate methods.

	public void search(String productName) {
		System.out.println("Search for: " + productName);
	}
	
//	public String search(String productName) {
//		System.out.println("Search for: " + productName);
//		return productName;
//	}

	public void search(String productName, int price) {
		System.out.println("Search for: " + productName + " and Price upto: " + price);
	}

	public void search(int price, String productName) {
		System.out.println("User Budget: " + price + " and looking for: " + productName);
	}

	public void search(String productName, double rating) {
		System.out.println("Search for: " + productName + " having rating equal to or more than: " + rating);
	}

	public void search(String productName, boolean availability) {
		System.out.println("Search for: " + productName + " and is product available: " + availability);
	}

	public static void main(String[] args) {
		SearchProduct s1 = new SearchProduct();
		s1.search("\"Mobile\"");
		s1.search("\"Mobile\"", 25000);
		s1.search(40000, "\"Tablet\"");
		s1.search("\"Mobile\"", 4.5);
		s1.search("\"Laptop\"", true);
	}

}
