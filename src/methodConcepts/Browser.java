package methodConcepts;

public class Browser {

	// WAF:
	// parameter - browser
	// return - true if browser matches
	// return false if browser does not match
	
//method having single return at the end
	public boolean launchBrowser (String browserName) {
		System.out.println("Browser Name = " + browserName);
		boolean isLaunched = true;
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Open Chrome browser.");
			break;
		case "firefox":
			System.out.println("Open Firefox browser");
			break;
		case "edge":
			System.out.println("Open Edge browser");
			break;
		default:
			System.out.println("Please enter correct browser name");
			isLaunched = false;
			break;
		}
		return isLaunched;
	}
	
	//method having return for each switch case (Note:Break and return keywords can not be used together)
	
	public boolean launchMyBrowser(String browsername) {
		System.out.println("Browser Name = " + browsername);
		
		switch (browsername.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Launch chrome browser");
			return true;
		case "firefox":
			System.out.println("Launch firefox browser");
			return true;
		case "edge":
			System.out.println("Launch edge browser");
			return true;
		default:
			System.out.println("Please enter correct browser");
			return false;
		}
	}
	
	
	

	public static void main(String[] args) {
		Browser openBrowser = new Browser();
		boolean b1 = openBrowser.launchBrowser("EDGE");

		if (b1) {
			System.out.println("Enter URL.");
		} else {
			System.out.println("Do not enter URL.");
		}
		
		System.out.println("==========================");
		
		b1 = openBrowser.launchMyBrowser("IE");
		if(b1) {
			System.out.println("Enter URL");
		} else {
			System.out.println("DO not enter URL");
		}
	}
}
