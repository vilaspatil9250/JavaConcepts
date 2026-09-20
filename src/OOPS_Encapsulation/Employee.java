package OOPS_Encapsulation;

public class Employee {
	
	//Encalpusaltion implemented 
	//Instance variables are protected using private  keyword - those are not directly accessible outside class
	//set menthod - assign value to variable
	//get menthod - return value of variable
	//these are getter and setter methods
	//methods are public, so those are accessible outside class and those private variable can be accessed through these methods

	private String name;
	private int age;
	private char gender;
	private double sal;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public double getSal() {
		return sal;
	}
	
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
}
