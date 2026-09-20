package methodConcepts;

public class StudentResult {

	// Requirement >> Get student name...and return total marks
	// if student is not available...provide valid message
	// Prerequisite - Valid marks >> 0 to 300

	public int studentmarks(String student) {
		int marks = -1;
		int sub1 = -1;
		int sub2 = -1;
		int sub3 = -1;

		System.out.println("Marks of " + student + ":");

		if (student.equals("Raj")) {
			sub1 = 90;
			sub2 = 80;
			sub3 = 70;
		}

		else if (student.equals("Shyam")) {
			sub1 = 95;
			sub2 = 85;
			sub3 = 75;
		}

		else if (student.equals("Prem")) {
			sub1 = 99;
			sub2 = 89;
			sub3 = 76;
		}
		marks = sub1 + sub2 + sub3;
		return marks;
	}

	public static void main(String[] args) {
		StudentResult s1 = new StudentResult();
		int totalmarks = s1.studentmarks("Vilas");

		if (totalmarks >= 0) {
			System.out.println(totalmarks);
		} else {
			System.out.println("Provided student name not present in list. So can not display result.");
		}

	}

}
