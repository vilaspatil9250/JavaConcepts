package methodConcepts;

import java.util.ArrayList;

public class Customers {

	//method with return type as ArrayList > This method returns list of products
	public ArrayList<String> productList(String cust) {
		ArrayList<String> pList = new ArrayList<String>();

		if (cust.equals("Vilas")) {
			pList.add("iPhone");
			pList.add("Avenger");
			pList.add("iPad");
			pList.add("DualDisplay");
		} else if (cust.equals("Raj")) {
			pList.add("Samsung Mobile");
			pList.add("Dell Laptop");
			pList.add("Watch");
		} else {
			System.out.println("Invalid Customer name");
		}
		return pList;
	}

	public static void main(String[] args) {
		Customers cu = new Customers();
		ArrayList<String> list = cu.productList("Vilas");
		System.out.println("List of Products: " + list);
		System.out.println("Product count = " + list.size());
		
		System.out.println("=========================");
		list = cu.productList("Raj");
		System.out.println("List of Products: " + list);
		System.out.println("Product count = " + list.size());
		
		System.out.println("=========================");
		list = cu.productList("Kedar");
		System.out.println("List of Products: " + list);
		System.out.println("Product count = " + list.size());
	}

}
