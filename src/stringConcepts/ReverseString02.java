package stringConcepts;

public class ReverseString02 {
	
	public static StringBuilder reverse(StringBuilder sb) {
		StringBuilder s1 = new StringBuilder("");
		int len = sb.length();
		
		for (int i=(len-1); i>=0; i--) {
			s1 = s1.append(sb.charAt(i));
		}
		return s1;
	}
	
	
	

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("I love Automation testing.");
		System.out.println(reverse(sb));
		

	}

}
