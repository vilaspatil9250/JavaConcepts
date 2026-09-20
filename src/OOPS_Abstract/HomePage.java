package OOPS_Abstract;

public class HomePage extends Page{
	int users = 10;
	
	public HomePage() {
		System.out.println("Home Page - Default constructor");
	}

	public HomePage(int a) {
		System.out.println("Home Page - 1 Parameter constructor");
	}
	
	public HomePage(int a, int b) {
		System.out.println("Home Page - 2 Parameter constructor");
	}
	
	@Override
	public void pageTitle() {
		System.out.println("Home Page - Title");
	}

	@Override
	public void pageContent() {
		System.out.println("Home Page - content");
	}

	@Override
	public void leftNavigation() {
		System.out.println("Home Page - Left Navigation");
	}

	@Override
	public void pageLoadTime() {
		System.out.println("Home Page load time = 10 sec");
	}
	
	public void homePagesections() {
		System.out.println("Home Page sections - About us, Our Services and Contact Us");
	}
	
}
