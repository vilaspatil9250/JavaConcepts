package OOPS_Interface_School;

public class EuroSchool implements StateBoard, CentralBoard, InternationalBoard {

	@Override
	public void interlanguage() {
		System.out.println("Euro - International language - English ");

	}

	@Override
	public void interculture() {
		System.out.println("Euro - International culture - western ");

	}

	@Override
	public void centrallanguage() {
		System.out.println("Euro - central language - Hindi ");

	}

	@Override
	public void centralculture() {
		System.out.println("Euro - central culture - Indian ");

	}

	@Override
	public void statelanguage() {
		System.out.println("Euro - state language - Marathi ");

	}

	@Override
	public void stateculture() {
		System.out.println("Euro - state culture - Maharashtrian ");

	}

	@Override
	public void subjectList() {
		System.out.println("Euro - 7 subject for all boards");

	}

	//Default method of StateBoard interface overriden with public access modifier
	@Override
	public void stateExamPattern() {
		System.out.println("Euro - State exam pattern");
	}

}
