package OOPS_Encapsulation;

public class Company {

	//created object of another class - Employee
	//assigned values to private variable of Employee class using set method
	//accessed values of private variable of Employee class using get method
	
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.setName("Vilas");
		e1.setAge(33);
		e1.setGender('M');
		e1.setSal(44);
		
		System.out.println("Name = "+e1.getName());
		System.out.println("Age = "+e1.getAge());
		System.out.println("Gender = "+e1.getGender());
		System.out.println("Salary = "+e1.getSal());

	}

}
