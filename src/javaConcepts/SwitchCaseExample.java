package javaConcepts;

public class SwitchCaseExample {

	public static void main(String[] args) {

   System.out.println("==========Switch case example of Browser============");
		
		String browser = "  SAFARI   ";
		switch (browser.toLowerCase().trim()) {
		case "chrome": 
			System.out.println("Open Chrome browser"); 
			break;
		case "firefox": 
			System.out.println("Open Firefox browser");
		    break;
		case "edge": 
			System.out.println("Open Edge browser");
			break;
		case "safari": 
			System.out.println("Open Safari browser");
			break;
		default:
			System.out.println("Please enter correct browser");
			break;
		}
		System.out.println("=========switch case example of weekdays==============");
		
//Switch case example for day
		
		int day = 8;
		switch (day) {
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thrusday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		case 7: System.out.println("Sunday"); break;
		default: System.out.println("Invalid day. Please enter day value from 1 to 7.");
		}
		
		System.out.println("===========switch case example of vowle and consonent==============");
		
	
		char ch = '0';
		String test = String.valueOf(ch).toLowerCase();
		
		switch(test) {
		case "a": System.out.println(ch + " is a Vowel"); break;
		case "e": System.out.println(ch + " is a vowel"); break;
		case "i": System.out.println(ch + " is a vowel"); break;
		case "o": System.out.println(ch + " is a vowel"); break;
		case "u": System.out.println(ch + " is a vowel"); break;
		default : System.out.println(ch + " is a consonent"); break;
		}
		
		System.out.println("==========switch case example of user role=================");
		
		String role = "Admin";
		
		switch (role.toLowerCase()) {
		case "producer": 
			System.out.println(role.toUpperCase() + " user is having all access"); break;
		case "underwriter":
			System.out.println(role.toUpperCase() + " user is having approval access"); break;
		case "agent": 
			System.out.println(role.toUpperCase() + " user is having access to create quotes"); break;
		case "broker":
			System.out.println(role.toUpperCase() + " user is having access to sell policy");
		default:
			System.out.println("Please provide valid user role"); break;
		}
		
		
		
	}

}
