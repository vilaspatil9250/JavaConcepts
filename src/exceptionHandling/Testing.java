package exceptionHandling;

public class Testing {

	public void m1() {
		System.out.println("Method M1");
		m2();
	}

	public void m2() {
		System.out.println("Method M2");
		try {
			m3();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	public void m3() throws ArithmeticException {
		System.out.println("Method M3");
		int a = 10 / 0;
		System.out.println("Value = " + a);
	}

	public static void main(String[] args) {

		Testing obj = new Testing();

		obj.m1();

		System.out.println("End of Program.");

	}

}
