package stringConcepts;

public class StringMethods01 {

	public static void main(String[] args) {

		String str01 = "Good Morning. I have started again Automation study.";
		
		System.out.println("===String length and character position================");
		System.out.println(str01.length());
		System.out.println(str01.charAt(4));
		System.out.println(str01.charAt(3));
		System.out.println(str01.charAt(51));
//		System.out.println(str01.charAt(-1));
		
		System.out.println("===position 1st, 2nd nd 3rd occurance of any character in String===================");
		System.out.println(str01.indexOf('o'));//return 1st occurance of character 'o'
		System.out.println(str01.indexOf('o', str01.indexOf('o')+1)); // return 2nd occurance
		System.out.println(str01.indexOf('o', str01.indexOf('o', str01.indexOf('o')+1)+1)); //return 3rd occurance
	}

}
