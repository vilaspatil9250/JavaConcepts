package OOPS_Abstract;

public abstract class Page {
	int users = 5;
	
	public Page() {
		System.out.println("Page - Default constructor");
	}
	
	public Page(int a) {
		System.out.println("Page - 1 Parameter constructor");
	}
	
	public Page(int a, int b) {
		System.out.println("Page - 2 Parameter constructor");
	}
	
	public abstract void pageTitle();
	
	public abstract void pageContent();
	
	public abstract void leftNavigation();
	
	public final void logo() {
		System.out.println("Page - Common Logo");
	}
	
	public final void header() {
		System.out.println("Page - Common Header");
	}
	
	public final void footer() {
		System.out.println("Page - Common Footer");
	}
	
	public void pageLoadTime() {
		System.out.println("Page load time = 5 sec");
	}
	

}
