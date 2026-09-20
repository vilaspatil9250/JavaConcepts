package staticMethods;

public class Company {

	public void name(Company c1) {
		System.out.println("Company name: TCS");
		location(c1);
	}

	public void location(Company c2) {
		System.out.println("Company Location: Pune");
		departments(c2);
	}

	public void departments(Company c3) {
		System.out.println("Company Dept: Quality");
		Company.projects(c3);
	}

	public static void projects(Company c4) {
		System.out.println("Projects: Govt, BFSI");
		// Company p1 = new Company(); //don't create new object. Use already created
		// object by using 'call by reference'
		// p1.empcount();
		c4.empcount(); //here to call non static method in static method, we have created reference for object created in main method. no need to create new object.
	}

	public void empcount() {
		System.out.println("Emp count = 1001");
		// name();
	}

	public static void main(String[] args) {
		Company comp = new Company();
		comp.name(comp); //call by reference
	}

}
