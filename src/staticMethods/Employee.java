package staticMethods;

public class Employee {
	
	public static void dept() {
		System.out.println("Department - Quality");
	}

	public static void location() {
		System.out.println("Location - Pune");
	}
	
	public static void project(){
		System.out.println("Project - Insurance");
	}

	public int empid() {
		return 1001;
	}
	
	public static void main(String[] args) {
	Employee e1 = new Employee();
	int empnum = e1.empid();
	System.out.println("Employee ID - " + empnum);
	e1.dept(); //calling static method by using object. but this is not correct way. Showing warning 'should be accessed in static way'.
	location(); //calling static method directly. but this not recommended
	Employee.project(); // calling static method by using class. this is correct way

	}

}
