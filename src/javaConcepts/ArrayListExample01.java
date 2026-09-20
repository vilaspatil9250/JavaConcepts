package javaConcepts;

import java.util.ArrayList;

public class ArrayListExample01 {

	public static void main(String[] args) {
	
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar);
		System.out.println(ar.get(0));
		System.out.println(ar.size());
		System.out.println(ar.get(3));
	}

}
