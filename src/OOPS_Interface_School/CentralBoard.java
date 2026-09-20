package OOPS_Interface_School;

public interface CentralBoard {

	default void centralExamPattern() {
		System.out.println("Central exam pattern");
	}

	public static void centralmarksSystem() {
		System.out.println("Central max marks = 200");
	}

	public void centrallanguage();

	public void centralculture();

	public void subjectList();
}
