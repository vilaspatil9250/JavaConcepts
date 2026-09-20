package stringConcepts;

public class StringMethods02 {

	public static void main(String[] args) {
		String username = "Admin";
		String LoggedinMessage = "Welcome Admin, Logged in!";

		if (LoggedinMessage.indexOf(username) == 8) {
			System.out.println("PASS. " + username + " logged in successfully.");
		} else {
			System.out.println("FAIL. " + username + " not logged in successfully.");
		}

		if (LoggedinMessage.contains(username)) {
			System.out.println("PASS.");
		} 
		else {
			System.out.println("FAIL.");
		}

	}

}
