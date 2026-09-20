package dataConversion;

public class StringToOthers {

	public static void main(String[] args) {
		
		System.out.println("----Convert String to Int--------");
		String s1 = "100";
		int a = Integer.parseInt(s1);
		System.out.println(a+11);
		
		String s2 = "200ABC";
		//int b = Integer.parseInt(s2);	//NumberFormatException	
		int b = Integer.parseInt(s2.replace("ABC", ""));
		System.out.println(b+555);
		
		System.out.println("----Convert String to double--------");
		String s3 = "123.78";
		double c = Double.parseDouble(s3);
		System.out.println(c+10.11);
		
		System.out.println("----Convert String to boolean--------");
		String s4 = "FALSE";
		boolean d = Boolean.parseBoolean(s4);
		if(d) {
			System.out.println("Start test execution");
		} 
		else {
			System.out.println("Do not start execution");
		}
	}

}
