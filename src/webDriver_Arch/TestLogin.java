package webDriver_Arch;

public class TestLogin {
	static Webdriver driver;

	public static void main(String[] args) {
		
		String browser = "firefox";
		
		switch (browser.trim().toLowerCase()) {
		case "chrome": driver = new ChromeDriver(); break;
		case "firefox": driver = new FirefoxDriver(); break;
		case "edge": driver = new EdgeDriver(); break;
		case "safari": driver = new SafariDriver(); break;
		default: System.out.println("Please enter valid browser name.");
		}
		
		driver.get("www.google.com");
		String pageTitle = driver.getTitle();		
		System.out.println("Page name = " + pageTitle);
		driver.findElement("search");
		driver.click("search edit field");
		driver.sendkeys("search", "QA Automation");
		driver.quit();
	}

}
