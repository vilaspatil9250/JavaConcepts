package exceptionHandling;

public class OpenBrowser {

	public static void main(String[] args) {
		String browser = "Edge";

		switch (browser.trim().toLowerCase()) {
		case "chrome":
			System.out.println("Open Chrome.");
			break;
		case "firefox":
			System.out.println("Open Firefox.");
			break;
		case "safari":
			System.out.println("Open Safari.");
			break;
		case "edge":
			System.out.println("Open Edge.");
			break;
		default:
			System.out.println("Enter valid browser");
			throw new MyExcpetion("INVALID BROWSER");
		}
		
		System.out.println("Enter URL and perform actions");

	}

}
