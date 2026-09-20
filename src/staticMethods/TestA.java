package staticMethods;

public class TestA {

	// Calling main method of another class TestB
	//need to pass String[] arguments while calling another class main method

	public static void main(String[] args) {
		System.out.println("Main method of Class TestA");
		TestB.main(args);

		String[] browsers = { "Chrome", "Edge", "Firefox" };
		TestB.main(browsers);

	}

}
