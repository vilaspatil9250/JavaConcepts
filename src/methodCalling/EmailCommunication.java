package methodCalling;

public class EmailCommunication {
	//Calling non static method inside static method 
	//To call non static method, we need object reference
	//So passing object reference in Static method and calling non static method inside static method
	
	String application;

	public void ReceiveMail() {
		System.out.println("Mail will be received");
	}

	public static void sendMail(EmailCommunication e2) {
		System.out.println("Please send mail");
		e2.ReceiveMail();
		e2.application = "Zohomail";
		System.out.println("Application used: " + e2.application);
		
	}

	public static void sendMail() {
		System.out.println("Please send mail");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		EmailCommunication e1 = new EmailCommunication();
		e1.application = "Outlook";
		EmailCommunication.sendMail(e1); // call by reference
		System.out.println("======================");
		EmailCommunication.sendMail();
		e1.ReceiveMail();
		System.out.println("Application used: " + e1.application);
	}

}
