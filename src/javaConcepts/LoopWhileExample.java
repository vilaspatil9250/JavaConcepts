package javaConcepts;

public class LoopWhileExample {

	public static void main(String[] args) {

		int i = 1;
		while(i<=20) {
			System.out.println(i);
			i++;
		}
 System.out.println("=======================");
		
		 int a = 1;
		 while(a<=100) {
			 if(a%5==0) {
				 System.out.println(a + " is divisible by 5.");
			 }
			 a++;
		 }
 System.out.println("=======================");	
 	
 		char ch1 = 'a';
 		while(ch1<='z') {
 			System.out.println(ch1 + " = " + (int)ch1);
 			ch1++;
 		}
 		
 System.out.println("=======================");	 
		//Print odd numbers
 
 int b = 1;
 while(b<=100) {
	 if(b%2 != 0) {
		 System.out.println(b + " is odd number.");
	 }
	 b++;
 }
 System.out.println("=======================");	 
		
	float c = 1.0f;
	while(c<=10) {
		System.out.println(c);
		c++;
	}
	
System.out.println("=======================");	 
		
		int d = 0;
		while(d<=100) {
			if(d%9 == 0) {
				System.out.println(d);
			}
			d++;
		}
		System.out.println("=======================");	 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
