package OOPS_Interface_School;

public interface StateBoard {
	
	//After Java 8/1.8 >> Below changes are done for interface
	//static method allowed with method body. This is not abstract method. accessed by using Interface name directly.
	//static method can not be overridden. Same method can be available in child class. It is called method hiding
	//Default method - allowed with method body. This is not abstract method. Accessed by Object of class which is implementing this interface.
	//Default method can be overriden by using access modifier as public

	default void stateExamPattern() {
		System.out.println("State exam pattern");
	}

	public static void statemarksSystem() {
		System.out.println("State max marks = 100");
	}

	public void statelanguage();

	public void stateculture();

	public void subjectList();

}
