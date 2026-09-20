package methodConcepts;

import java.util.Arrays;

public class Products {
	
	//method with return type Arrays - when need to return multiple values
	public String [] list() {
		String [] pList = {"Mobile", "Laptop", "Camera", "Watch", "Sunglasses"};
		return pList;
	}

	public static void main(String[] args) {
		Products proList = new Products();
		String[] p1 = proList.list();

		System.out.println("List of available products: " + Arrays.toString(p1));
		System.out.println("Total Products: "+ p1.length);
	}

}
