package OOPS_Encapsulation;

public class Student {
	
	private String sName;
	private int sAge;
	private char sGender;
	private int fee;
	
	//public constructor: working as setter - assign values to variables while creating object
	public Student(String sName, int sAge, char sGender, int fee) {
		this.sName = sName;
		this.sAge = sAge;
		this.sGender = sGender;
		this.fee = fee;
	}
	
	//getter and setter method - 
	//getter: to retrive value
	//setter: to assign or to update value
	public String getName() {
		return sName;
	}
	
	public void setName(String sName) {
		this.sName = sName;
	}

	public int getAge() {
		return sAge;
	}
	
	public void setAge(int sAge) {
		this.sAge = sAge;
	}
	
	public char getGender() {
		return sGender;
	}
	
	public void setGender(char sGender) {
		this.sGender = sGender;
	}
	
	public int getfee() {
		return fee;
	}
	
	public void setfee(int fee) {
		this.fee = fee;
	}
	
	
}
