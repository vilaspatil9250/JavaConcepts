package javaConcepts;

public class LoopForExample {

	public static void main(String[] args) {

		for (int a = 1; a<=10; a++) {
			System.out.println(a);
		}
		
		System.out.println("==============================");
		
		for(char b = 'A'; b<='Z'; b++) {
			System.out.println(b + " = " + (byte)b);
		}
		
		System.out.println("==============================");	
		
		for (char c = 'a'; c<='z'; c++) {
			if(c=='a'| c =='e'|c=='i'|c=='o'| c=='u') {
				System.out.println(c + " is vowel.");
			} 
		}
		
		System.out.println("==============================");	
		
		for (int d = 1; d<=100; d++) {
			if(d%7==0) {
				System.out.println(d + " It's sunday. Will see you next week.");
				break;
			}
		}
		
		System.out.println("===========================");
		
	}

}
