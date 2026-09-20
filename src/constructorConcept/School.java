package constructorConcept;

public class School {
	
	
	//AC: Exam form registation
	//fill form using below data
	//name, roll number
	//name, standard, dob
	//name, standard, roll number, dob
	//name, standard, roll number, dob, gender
	
	String name;
	int rollNum;
	int standard;
	String dob;
	char gender;
	
	//Program with constructor
	//Const..will have same name as class name
	//Const... can not be static
	//Const...can not have any return type
	//Const...will be used to initialize instance variable while creating object
	//Const...used to prevent creation of unnecessary object creation
	//if const is not defined...system will pick default constructor (not having any parameter)
	//this keyword is used to call instance variable
	//example this.name >> it is instance variable and name >> it is local variable value declared in main method
	//this.name = name >> here local variable value assigned to instance variable.
	//to write constructor...right click ===> sources ===> Generate Constructors using fields ===> Select required instance variables
	
	public School(String name, int rollNum) {
		this.name = name;
		this.rollNum = rollNum;
	}
	
	public School(String name, int standard, String dob) {
		this.name = name;
		this.standard = standard;
		this.dob = dob;
	}
	
	public School(String name, int standard, int rollNum, String dob) {
		this.name = name;
		this.standard = standard;
		this.rollNum = rollNum;
		this.dob = dob;
	}
	
	public School(String name, int standard, int rollNum, String dob, char gender) {
		this.name = name;
		this.standard = standard;
		this.rollNum = rollNum;
		this.dob = dob;
		this.gender = gender;
	}
	
	public static void main(String[] args) {
		School s1 = new School("Raj", 1001);
		System.out.println("Name: "+ s1.name + "; Roll Number: " + s1.rollNum );
		
		School s2 = new School("Kedar", 7, "01/01/2010");
		System.out.println("Name: "+s2.name+"; Standard: "+s2.standard+"; Date of Birth: "+s2.dob);
		
		School s3 = new School("Jayesh", 5, 2001, "05/05/2015");
		System.out.println("Name: "+s3.name+"; Standard: "+s3.standard+"; Roll Number: "+s3.rollNum +"; Date of Birth: "+s3.dob);
		
		School s4 = new School("Rajesh", 8, 3001, "05/05/2009", 'M');
		System.out.println("Name: "+s4.name+"; Standard: "+s4.standard+"; Roll Number: "+s4.rollNum +"; Date of Birth: "+s4.dob+"; Gender: "+s4.gender);
	}

}
