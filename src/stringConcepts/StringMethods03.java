package stringConcepts;

public class StringMethods03 {

	public static void main(String[] args) {
		System.out.println("=======trim() method==========");
		String s1 = "           Hello Good morning.       ";
		System.out.println("String length before Trim:  " + s1.length());
		System.out.println(s1.trim());
		System.out.println("String length after Trim: " + s1.trim().length());

		System.out.println("=======replace() method==========");
		String s2 = "I love Java programming.";
		System.out.println(s2.replace(" ", ""));
		System.out.println(s2.replace(' ', '_'));
		System.out.println(s2.replace("Java", "JavaScript"));
		
		System.out.println("========UPPERCASE/lowsercase======");
		String s3 = " Good morning. Have a good day ahead!";
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		System.out.println("=======StartsWith/EndsWith=======");
		String s4 = "Happy Sunday. Plan your day and execute as per plan.";
		System.out.println(s4.startsWith("Happy"));
		System.out.println(s4.endsWith("plan"));
		
		System.out.println("========equals==========");
		String s5 = "Hello Automation Testing.";
		String s6 = "Hello Automation Testing.";
		String s7 = "Hello Automation Testing!";
		String s8 = "hello automation testing!";
		
		System.out.println(s5.equals(s6));
		System.out.println(s5.equals(s7));
		System.out.println(s7.equals(s8));
		System.out.println(s7.equalsIgnoreCase(s8));
	}

}
