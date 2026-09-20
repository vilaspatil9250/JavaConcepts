package staticMethods;

public class Mailing {
	
	//Example of Static method overloading
	//Static method overloading allowed
	
	public static void sendMail() {
		System.out.println("Send mail without any inputs");
		System.out.println("======================");
	}
	
	public static void sendMail(String sub) {
		System.out.println("Mail Subject: " + sub);
		System.out.println("======================");
	}
	
	
	public static void sendMail(String sub, String to) {
		System.out.println("Mail Subject: " + sub);
		System.out.println("Mail to: " + to);
		System.out.println("======================");
	}
	
	public static void sendMail(String sub, String to, String cc) {
		System.out.println("Mail Subject: " + sub);
		System.out.println("Mail to: " + to);
		System.out.println("Mail cc: " + cc);
		System.out.println("======================");
	}
	
	
	public static void sendMail(String sub, String to, String cc, String body) {
		System.out.println("Mail Subject: " + sub);
		System.out.println("Mail to: " + to);
		System.out.println("Mail cc: " + cc);
		System.out.println("Mail body: " + body);
		System.out.println("======================");
	}

	public static void main (String[] args) {
		Mailing.sendMail();
		Mailing.sendMail("Test Mail");
		Mailing.sendMail("Test Mail", "Vilas");
		Mailing.sendMail("Test Mail", null, null);
		Mailing.sendMail("Test Mail", "Vilas", "Raj", "This is mail body.");
	}

}
