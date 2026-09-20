package methodConcepts;

public class LoginMethodOverloading {
	
	public void login() {
		System.out.println("Login with credentials - SSO Login");
	}
	
	public void login (String uname, String pwd) {
		System.out.println("Login with usernmae and Password ");
	}
	
	public void login (String uname, String pwd, int otp) {
		System.out.println("Login with usernmae and Password and otp");
	}
	
	public void login(int applicationid, String pwd) {
		System.out.println("Login with Application number and Password ");
	}
	
	public void login(long mobilenum, int otp) {
		System.out.println("Login with mobile number and otp ");
	}

	public static void main(String[] args) {
		LoginMethodOverloading user1 = new LoginMethodOverloading();
		
		user1.login();
		user1.login("username", "password");
		user1.login("username", "password", 102030);
		user1.login(1020304050, "password");
		user1.login(9080709080l, 102030);
	}

}
