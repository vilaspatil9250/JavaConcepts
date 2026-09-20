package javaConcepts;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "Safari";
		if (browser.equals("Chrome"))
			{ System.out.println("Open Chrome browser");
		} else if (browser.equals("Safari")) {
			System.out.println("Open Safari browser");
		} else if (browser.equals("Firefox")) {
			System.out.println("Open Firefox browser");
		} else {
			System.out.println("Please enter valid browser");
		}

	}

}
