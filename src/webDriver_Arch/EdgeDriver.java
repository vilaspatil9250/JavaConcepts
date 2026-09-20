package webDriver_Arch;

public class EdgeDriver implements Webdriver{
	public EdgeDriver() {
		System.out.println("Launch Edge Browser");
	}
	
	@Override
	public void get(String url) {
		System.out.println("Enter URL " + url);	
	}

	@Override
	public String getTitle() {
		return "Login Page";
	}

	@Override
	public void findElement(String ele) {
		System.out.println("Find Element "+ ele);
	}

	@Override
	public void click(String ele) {
		System.out.println("Click on "+ ele);
	}

	@Override
	public void sendkeys(String ele, String value) {
		System.out.println("enter value in element "+ ele + " with value "+ value);	
	}

	@Override
	public void quit() {
		System.out.println("Close Edge browser");
	}

}
