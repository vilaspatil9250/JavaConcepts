package methodConcepts;

public class Income {

	public int totalSalary(int baseSalary, int adhocAllowance, int hra, int bonus, boolean isapplicable) {
		System.out.println("Calculate total salary....");
		int salary = (baseSalary + adhocAllowance + hra);
		if (isapplicable) {
			salary = salary + bonus;
		}
		return salary;

	}

	public static void main(String[] args) {
		Income inc = new Income();
		int jobSal = inc.totalSalary(20000, 5000, 5000, 10000, true);
		System.out.println("Income from Job = " + jobSal);
		
		System.out.println("=======================");
		jobSal = inc.totalSalary(30000, 5000, 2000, 5000, false);
		System.out.println("Income from Job = " + jobSal);
	}
	
	

}
