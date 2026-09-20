package javaConcepts;

public class Employee {

	String name;
	int id;
	String dept;
	String desigation;
	int age;

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "Shyam";
		e1.id = 101;
		e1.dept = "Quality";
		e1.desigation = "QA Lead";
		e1.age = 34;
		
		
		Employee e2 = new Employee();
		e2.name = "Ram";
		e2.id = 102;
		e2.dept = "Admin";
		e2.desigation = "HR";
		e2.age = 31;
		
		Employee e3 = new Employee();
		e3.name = "Kiran";
		e3.id = 103;
		e3.dept = "Support";
		e3.desigation = "Head";
		e3.age = 45;
		
		Employee e4 = new Employee();
		e4.name = "Rajesh";
		e4.id = 104;
		e4.dept = "Service";
		e4.desigation = "Engineer";
		e4.age = 25;
		

		System.out.println("e1 = " + e1.id + " " + e1.name + " " + e1.dept + " " + e1.desigation + " " + e1.age);
		System.out.println("e2 = " + e2.id + " " + e2.name + " " + e2.dept + " " + e2.desigation + " " + e2.age);
		System.out.println("e3 = " + e3.id + " " + e3.name + " " + e3.dept + " " + e3.desigation + " " + e3.age);
		System.out.println("e4 = " + e4.id + " " + e4.name + " " + e4.dept + " " + e4.desigation + " " + e4.age);
		
		System.out.println("========================================================================");
		
		e1 = e2;
		e2 = e3;
		e3 = e4;
		e4 = e1;
		
		System.out.println("e1 = " + e1.id + " " + e1.name + " " + e1.dept + " " + e1.desigation + " " + e1.age);
		System.out.println("e2 = " + e2.id + " " + e2.name + " " + e2.dept + " " + e2.desigation + " " + e2.age);
		System.out.println("e3 = " + e3.id + " " + e3.name + " " + e3.dept + " " + e3.desigation + " " + e3.age);
		System.out.println("e4 = " + e4.id + " " + e4.name + " " + e4.dept + " " + e4.desigation + " " + e4.age);
		
		System.out.println("========================================================================");
		
		e1 = e2 = e3;
		e2 = e3 = e4;
		
		System.out.println("e1 = " + e1.id + " " + e1.name + " " + e1.dept + " " + e1.desigation + " " + e1.age);
		System.out.println("e2 = " + e2.id + " " + e2.name + " " + e2.dept + " " + e2.desigation + " " + e2.age);
		System.out.println("e3 = " + e3.id + " " + e3.name + " " + e3.dept + " " + e3.desigation + " " + e3.age);
		System.out.println("e4 = " + e4.id + " " + e4.name + " " + e4.dept + " " + e4.desigation + " " + e4.age);
		
		System.out.println("========================================================================");
		
		
	}

}
