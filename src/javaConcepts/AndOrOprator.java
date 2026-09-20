package javaConcepts;

public class AndOrOprator {
	
	public static void main(String[] args) {
		
//// voter eligibility
//		
////		int age = 18;
////		String Country = "india";
////		//String cnt = Country.toLowerCase().trim();
////		
////		if(age>=18 & Country== "india") {
////			System.out.println("eligible for voting");
////		}
////		else {
////			System.out.println("not eligible for voting");
////		}
//		
//		System.out.println("=================================");
//	
//		// eligible for discount
//		int purchaseValue = 900;
//		String membership = "Non-Prime";
//		String City = "Mumbai";
//		
//		if (purchaseValue >= 1000 && membership == "Prime"  && City == "Pune" ) {
//			System.out.println("You will get 30% Discount");
//		} else if (purchaseValue >= 1000 || membership == "Prime"  || City == "Pune" ) {
//			System.out.println("You will get 15% discount");
//		} else {
//			System.out.println("Sorry, you will not get any discount.");
//		}
//		
//		System.out.println("=================================");		
//		// find greatest number out of given 5 numbers
//		
//		int a = 444;
//		int b = 666;
//		int c = 555;
//		int d = 777;
//		int e = 888;
//		
//		if (a>b && a>c && a>d && a>e) {
//			System.out.println(a + " is the greatest number.");
//		} 
//		else if (b>c && b>d && b>e) {
//			System.out.println(b + " is the greatest number.");
//		} 
//		else if (c>d && c>e) {
//			System.out.println(c + " is the greatest number.");
//		} 
//		else if (d>e) {
//			System.out.println(d + " is the greatest number.");
//		} 
//		else {
//			System.out.println(e  + " is the greatest number.");
//		}
//	}
       System.out.println("=================================");		
//		//short circuit behavior
		
				
		int x = 10;
		if(x>5 || printmessage()) {
			System.out.println("Passed1");
		}
		if (x > 5 | printmessage()) {
			System.out.println("Passed2");
		}
		
		System.out.println("=============================");
		//User able to access network
		
		boolean isUser = true;
		boolean isAdmin = false;
		int userLevel = 5;
		
		if(isAdmin || (isUser && userLevel > 5)) {
			System.out.println("Able to access network");
		} else {
			System.out.println("Don't have access to network");
		}
		
		
		
		
	}

	private static boolean printmessage() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
