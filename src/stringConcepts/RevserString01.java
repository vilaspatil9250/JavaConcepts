package stringConcepts;

public class RevserString01 {
	
	public static String reverse(String s1) {
		String rev = "";
		int len;
		try {
		len = s1.length();
		}
		catch (NullPointerException e) {
			return s1;
		}
		
		if(len==0 || len==1) {
			return s1;
		} 
		
		for (int i=(len-1); i>=0; i--) {
			rev = rev+s1.charAt(i);
		}
		return rev;
	}
	
	public static void main(String[] args) {
		
		String s2 = reverse("Selenium");
		System.out.println(s2);
		
		s2 = reverse("A");
		System.out.println(s2);
		
		s2 = reverse("");
		System.out.println(s2);
		
		s2 = reverse(" ");
		System.out.println(s2);
		
		s2 = reverse(null);
		System.out.println(s2);
		
		s2 = reverse("AUTOMATION-TESTING");
		System.out.println(s2);
	}

}
