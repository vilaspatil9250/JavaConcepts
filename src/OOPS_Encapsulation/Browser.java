package OOPS_Encapsulation;

public class Browser {
	
	//private String browserName;
	
	public void launchBrowser(String browserName) {
		checkOS();
		checkRAM();
		checkAdminRights();
		System.out.println("Launch Browser: "+ browserName);
	}

	private void checkOS() {
		System.out.println("Correct OS - Windoows");
	}
	
	private void checkRAM() {
		System.out.println("Correct RAM size - 16 GB");
	}
	
	private void checkAdminRights() {
		System.out.println("Correct access permissions - Admin Rights");
	}
	
}
