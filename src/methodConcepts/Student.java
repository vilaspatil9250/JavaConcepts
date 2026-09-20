package methodConcepts;

public class Student {

	// menthod - no input and no return
	public void test() {
		System.out.println("Test method - no input and no return");
	}

	// method - no input but some return
	public String name() {
		System.out.println("Menthod for student name");
		String sname = "Vilas";
		return sname;
	}

	// method - some input and some output
	// int a and int b >> parameteres
	// return type of method >> int
	public int studentMarks(int a, int b) {
		System.out.println("Method to add marks");
		int marks = a + b;
		return marks;
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.test();
		System.out.println("=============================");

		String sname = s1.name();
		System.out.println(sname);

		System.out.println("=============================");

		int totalmarks = s1.studentMarks(98, 99);
		System.out.println(totalmarks);
	}

}
