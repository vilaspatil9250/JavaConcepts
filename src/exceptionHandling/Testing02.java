package exceptionHandling;

public class Testing02 {

	public static void main(String[] args) {

		String name = null;

		if (name == null) {
			System.out.println("no record found");
			throw new NullPointerException("=====NULL VALUE======");
		}
		System.out.println("Record = " + name);
	}

}
