package exceptionHandling;

public class Calculator {

	public void addition(int a, int b) {
		try {
			int c = a / b;
			System.out.println("Result = " + c);
		} catch (ArithmeticException e) {
			System.out.println("Please do not divide by 0");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		c1.addition(10, 5);
		c1.addition(10, 0);
		System.out.println("End of Program.");

	}

}
