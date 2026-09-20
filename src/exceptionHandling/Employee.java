package exceptionHandling;

public class Employee {

	String empName;

	public static void main(String[] args) {

		try {
			int a = 10 / 2;
			System.out.println(a);
			int empid[] = new int[10];
			empid[9] = 1012;
			System.out.println(empid[9]);

			Employee e1 = new Employee();
			e1 = null;
			e1.empName = "John";
		}

		catch (ArithmeticException e) {
			System.out.println("divided by 0.");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of Bound");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		System.out.println("Enf of progamm.");
	}

}
