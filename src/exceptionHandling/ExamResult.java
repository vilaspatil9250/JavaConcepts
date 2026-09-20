package exceptionHandling;

public class ExamResult {

	public int result(String name) {
		System.out.println("Student Name = " + name);
		int a = 0;
		if (name.equals("Vilas")) {

			try {
				a = 100 / 0;
				// System.exit(1);//shut down the JVM
				return a;
			} catch (ArithmeticException e) {
				e.printStackTrace();
				return 35; //min marks required for passing
			}
			finally {
				System.out.println("This is finally block");
				//return a;
			}
		} else {
			System.out.println("Please enter correct name.");
			return a;
		}
	}

	public static void main(String[] args) {
		ExamResult e1 = new ExamResult();
		int m1 = e1.result("Vilas");
		System.out.println("Mark of the student = " + m1);
		System.out.println("Result done.");
		System.out.println("=====================");
		int m2 = e1.result("Wilson");
		System.out.println("Mark of the student = " + m2);
		System.out.println("Result done.");

	}

}
