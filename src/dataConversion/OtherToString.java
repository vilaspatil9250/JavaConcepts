package dataConversion;

public class OtherToString {

	public static void main(String[] args) {
		System.out.println("========Int to String==========");
		int a = 100;
		String s1 = String.valueOf(a);
		System.out.println(s1+200);
		
		System.out.println("========Double to String==========");
		double b = 120.22;
		String s2 = String.valueOf(b);
		System.out.println(s2+1.23);
		
		float c = 1.23f;
		String s3 = String.valueOf(c);
		System.out.println(s3+1.22);
		
		System.out.println("========Boolean to String==========");
		boolean d = false;
		String s4 = String.valueOf(d).toUpperCase();
		System.out.println(s4);
	}

}
