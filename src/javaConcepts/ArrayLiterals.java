package javaConcepts;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		//Array literals
		
		int num[] = {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(num));
		
		System.out.println("===================================");

		for(int i=num.length-1; i>=0; i--) {
			System.out.println(num[i]);
		}
		
		System.out.println("===================================");
		
		Object emp[] = {"Vilas", 30, 55.99, 'M', true};
		System.out.println(Arrays.toString(emp));
		
		System.out.println("===================================");
	}

}
