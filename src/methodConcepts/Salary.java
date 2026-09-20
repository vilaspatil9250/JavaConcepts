package methodConcepts;

public class Salary {

	// method to calculate salary,
	// method to calculate tax
	// method to calculate final salary
	// define class variables - common deductions

	public double salary(String designation, String department, int performaceRating) {

		int baseSalary = 0;
		int allowance = 0;
		double bonus = 0;
		double salaryBeforeTax = 0;
		double tax = 0;
		double salaryAfterTax = 0;
		
		switch (designation.trim().toLowerCase()) {
		case "intern":
			baseSalary = 5000;
			break;
		case "junior enginner":
			baseSalary = 10000;
			break;
		case "senior enginner":
			baseSalary = 15000;
			break;
		case "team lead":
			baseSalary = 20000;
			break;
		case "manager":
			baseSalary = 25000;
			break;
		case "director":
			baseSalary = 30000;
			break;
		default:
			System.out.println("Please enter correct designation.");
			break;
		}

		switch (department.trim().toLowerCase()) {
		case "hr":
			allowance = 2000;
			break;
		case "engineering":
			allowance = 1000;
			break;
		case "sales":
			allowance = 2000;
			break;
		case "service":
			allowance = 3000;
			break;
		default:
			System.out.println("Please enter correct department.");
			break;
		}

		switch (performaceRating) {
		case 1:
			bonus = baseSalary * .25;
			break;
		case 2:
			bonus = baseSalary * .10;
			break;	
		case 3:
			bonus = baseSalary * .05;
			break;	
		case 4:
			bonus = baseSalary * 0;
			break;	
		default:
			System.out.println("Please enter correct performaceRating.");
			break;
		}

		salaryBeforeTax = baseSalary+allowance+bonus;
		
		if(salaryBeforeTax >= 50000) {
			tax = .10;
		} else if(salaryBeforeTax <50000 && salaryBeforeTax >= 30000) {
			tax = .05;
		} else if(salaryBeforeTax <30000 && salaryBeforeTax >= 15000) {
			tax = .02;
		} else {
			tax = 0;
		}
		
		
		salaryAfterTax = salaryBeforeTax -(salaryBeforeTax * tax);
		return salaryAfterTax;
	}
	
		

	public static void main(String[] args) {
		Salary s1 = new Salary();
		System.out.println("Payment - Engineering Department - Manager - 2 rating:");
		double payment1 = s1.salary("Manager", "engineering", 2);
		System.out.println(payment1);
		System.out.println("=======================================");
		System.out.println("Payment - Engineering Department - senior enginner - 1 rating:");
		double payment2 = s1.salary("senior enginner", "engineering", 1);
		System.out.println(payment2);
		System.out.println("=======================================");
		System.out.println("Payment - sales Department - director - 3 rating:");
		double payment3 = s1.salary("director", "sales", 3);
		System.out.println(payment3);
		System.out.println("=======================================");
	}

}
