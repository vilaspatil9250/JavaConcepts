package methodConcepts;

public class OpenBrowser {
	
	//WAF - Provide browser name
	//Open browser and enter url
	
	public boolean browser(String browsername) {
		boolean islaunhed = true;
		switch (browsername.trim().toLowerCase()) {
		case "chrome": System.out.println("Open chrome browser");
			break;
		case "firefox": System.out.println("Open firefox browser");
		break;
		case "edge": System.out.println("Open edge browser");
		break;
		case "safari": System.out.println("Open safari browser");
		break;
		
		default:
			System.out.println("Please enter correct browser");
			islaunhed = false;
			break;
		}
		return islaunhed;
	}
	

	public static void main(String[] args) {
	
		OpenBrowser b1 = new OpenBrowser();
		boolean result = b1.browser("browserstack");
	
		if (result) {
			System.out.println("Enter URL:");
		} 
		else {
			System.out.println("Valid browser names = chrome, firefox, edge, safari");
		}
	}

}
