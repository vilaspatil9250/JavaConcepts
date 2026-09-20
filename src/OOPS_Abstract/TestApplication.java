package OOPS_Abstract;

public class TestApplication {

	public static void main(String[] args) {

		HomePage hp = new HomePage();
		hp.logo();
		hp.header();
		hp.footer();
		hp.pageTitle();
		hp.pageContent();
		hp.leftNavigation();
		hp.homePagesections();
		hp.pageLoadTime();
		System.out.println(hp.users);
		System.out.println("=======================");

		//top casting - Child class object called by Parent class reference variable
		Page pg = new HomePage();
		pg.logo();
		pg.header();
		pg.footer();
		pg.pageTitle();
		pg.pageContent();
		pg.leftNavigation();
		pg.pageLoadTime();
		System.out.println(pg.users);
		System.out.println("=======================");
		
		//when we have  constructors in child and Parent class >> then when we create object of child class
		//then parent class default constructor is called first and then child class - respective constructor is called
		//in below case, Parent class constructor "public page()" is called first and then "public HomePage(int a)" is called
		HomePage hp1 = new HomePage(10);
		System.out.println("=======================");
		
		//in below case, Parent class constructor "public page()" is called first and then "public HomePage(int a, int b)" is called
		HomePage hp2 = new HomePage(10, 20);
		System.out.println("=======================");
		
		
	}

}
