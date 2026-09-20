package stringConcepts;

import java.util.Arrays;

public class StringMethods04 {
	
	public static void main(String[] args) {
		System.out.println("=====Split method===========");
		
		String msg01 = "I love Java Programming.";
		String sp01[] = msg01.split(" ");
		System.out.println(Arrays.toString(sp01));
		System.out.println("================");
		String msg02 = "Java_Python_Javascript_Ruby_C#_vibe coding";
		String sp02[] = msg02.split("_");
		System.out.println(sp02[0]);
		System.out.println(sp02[1]);
		System.out.println(sp02[2]);
		System.out.println(sp02[3]);
		System.out.println(sp02[4]);
		System.out.println(sp02[5]);
		System.out.println("================");
		String msg03 = "AAHelloAAIAAamAAgoodAAinAAautomationAAtesting.";
		String sp03[]=msg03.split("AA");
		System.out.println(sp03[0]);
		System.out.println(sp03[1]);
		System.out.println(sp03[2]);
		System.out.println(sp03[3]);
		System.out.println(sp03[4]);
		System.out.println(sp03[5]);
		System.out.println(sp03[6]);
		System.out.println(sp03[7]);
		System.out.println("======\\ is used to escape character '.'=======");
		String msg04 = "Vilas.Patil.Senior QA Lead.Pune";
		String sp04[] = msg04.split("\\.");
		System.out.println(Arrays.toString(sp04));
		System.out.println("=======\\\\ is used to escape character '|'=========");
		String msg05 = "Vilas|Patil|Senior QA Lead|Pune";
		String sp05[] = msg05.split("\\|");
		System.out.println(Arrays.toString(sp05));
		System.out.println("========\\\\ is used to escape character '||'========");
		String msg06 = "Vilas||Patil||Senior QA Lead||Pune";
		String sp06[] = msg06.split("\\|\\|");
		System.out.println(Arrays.toString(sp06));
		System.out.println("================");
		System.out.println("I love 'Java' programming.");
		System.out.println("I love \"Java\" programming.");
		System.out.println("========Sub string========");
		String msg07 = "Order placed successfully and your Order ID is 111222333";
		System.out.println(msg07.length());
		System.out.println(msg07.substring(11));
		System.out.println(msg07.substring(47));
		System.out.println(msg07.substring(30, 46));
		System.out.println(msg07.substring(msg07.indexOf("is")+3, msg07.length()));
		System.out.println("================");
		String msg08 = "Vilas\\Patil\\Senior QA Lead\\Pune";
		String sp08[] = msg08.split("\\\\");
		System.out.println(Arrays.toString(sp08));
	}

}
