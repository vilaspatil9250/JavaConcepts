package mapConcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapConcept {

	public static void main(String[] args) {
		System.out.println("=========HashMap Example - null key allowed, multiple null values allowed but no sequence maintained=========");
		HashMap<String, Integer> EmpData = new HashMap<String, Integer>();
		EmpData.put("Vilas", 102030);
		EmpData.put("John", 101010);
		EmpData.put(null, null);
		EmpData.put("Mike", 101020);
		EmpData.put("Sine", 101030);
		EmpData.put("Kite", 101040);
		EmpData.put("Kite", 101050);
		EmpData.put("Samay", null);
		EmpData.put("Aarav", null);
		System.out.println(EmpData);
		System.out.println(EmpData.get("Mike"));
		System.out.println();
		
		System.out.println("====LinkedHashMap Example - null key allowed, multiple null values allowed. Sequence maintained - Insertion order=========");
		LinkedHashMap<String, Double> studentMarks = new LinkedHashMap<String, Double>();
		studentMarks.put("Samay", 35.99);
		studentMarks.put("Vihan", 45.89);
		studentMarks.put("Ishan", 65.05);
		studentMarks.put("Aarav", null);
		studentMarks.put("Raghav", null);
		studentMarks.put(null, 100.00);
		//studentMarks.put(null, null);
		studentMarks.put("Raghav", 67.09);
		System.out.println(studentMarks);
		System.out.println(studentMarks.get(null));
		studentMarks.replace("Aarav", null, 56.89);
		System.out.println(studentMarks);
		studentMarks.remove(null);
		System.out.println(studentMarks);
		System.out.println();
		
		System.out.println("=====TreeMap: Null key not allowed, multiple null values allowed, Sorting by Key in asceding order=====");
		TreeMap<Integer, String> DeptList = new TreeMap<Integer, String>();
		DeptList.put(200, "admin");
		DeptList.put(500, "Sales");
		DeptList.put(100, "Prod");
		DeptList.put(600, "Support");
		DeptList.put(300, "Service");
		DeptList.put(400, "Quality");
		DeptList.put(250, null);
		DeptList.put(350, null);
		System.out.println(DeptList);
		System.out.println();
		
		System.out.println("======Top-casting===========");
		System.out.println("====HashMap class object referred by Map interface reference variable");
		Map<String, Object> productDetails = new HashMap<String, Object>();
		productDetails.put("ProductName", "Mobile");
		productDetails.put("Brand", "iPhone");
		productDetails.put("Price", 23567);
		productDetails.put("Rating", 4.3);
		productDetails.put("In stock", true);
		System.out.println(productDetails);
		System.out.println("=================");	
		
		System.out.println("====LinkedHashMap class object referred by Map interface reference variable");
		productDetails = new LinkedHashMap<String, Object>();
		productDetails.put("ProductName", "Mobile");
		productDetails.put("Brand", "iPhone");
		productDetails.put("Price", 23567);
		productDetails.put("Rating", 4.3);
		productDetails.put("In stock", true);
		System.out.println(productDetails);
		System.out.println("=================");
		
		System.out.println("====TreeMap class object referred by Map interface reference variable");
		productDetails = new TreeMap<String, Object>();
		productDetails.put("ProductName", "Mobile");
		productDetails.put("Brand", "iPhone");
		productDetails.put("Price", 23567);
		productDetails.put("Rating", 4.3);
		productDetails.put("In stock", true);
		System.out.println(productDetails);
		System.out.println("=================");
		
	}

}
