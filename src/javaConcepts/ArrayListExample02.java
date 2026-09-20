package javaConcepts;

import java.util.ArrayList;

public class ArrayListExample02 {

	public static void main(String[] args) {
	
		//ArrayList with generics -- Data type
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		marks.add(200);
		marks.add(300);
		marks.add(400);
		marks.add(500);
		
		System.out.println(marks.size());
		System.out.println(marks);

		marks.add(600);
		System.out.println(marks.size());
		System.out.println(marks);
		
		marks.add(4, 450);
		System.out.println(marks.size());
		System.out.println(marks);
		
		marks.set(5, 470);
		System.out.println(marks.size());
		System.out.println(marks);
	}

}
