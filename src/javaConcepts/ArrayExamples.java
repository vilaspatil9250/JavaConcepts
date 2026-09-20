package javaConcepts;

import java.util.Arrays;

public class ArrayExamples {

	public static void main(String[] args) {
		
		int i[] = new int [5];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		
		
		//for loop
		for(int k=0; k<i.length; k++) {
			System.out.println(i[k]);
		}
		System.out.println("===================");
		//reverse array 
		for(int l=(i.length-1); l>=0; l--) {
			System.out.println(i[l]);
		}
		System.out.println("===================");
		
		//for each loop
		for(int e : i) {
			System.out.println(e);
		}
		
		System.out.println("===================");
		
		//print array variable directly >>it will print memory address of array variable. This is incorrect.
		System.out.println(i);
		
		System.out.println("===================");
		
		//use of Arrays class to print array list
		System.out.println(Arrays.toString(i));
		
		System.out.println("===================");
		//object array - to store data of different data types
		//emp name>>String, Age>>int, salary>>double, Gender>>char, isPermanent>>boolean
		Object emp[] = new Object[5];
		emp[0] = "Vilas";
		emp[1] = 33;
		emp[2] = 55.99;
		emp[3] = 'm';
		emp[4] = true;
		
		for(Object e : emp) {
			System.out.println(e);
		}
	}

}
