package OOPS_Interface_School;

public class SchoolAdmission {

	public static void main(String[] args) {
		
		//Object of child class is created by using reference of Stateboard Interface.
		//But by using this ref variable, we can access only methods which are availble in respective interface
		//To access methods of another interface, we can typecase Stateboard ref variable in CentralBoard or InternationalBoard interface.
		//Then we can access methods of respective interface
	
		StateBoard s1 = new EuroSchool(); //child class object referred by parent interface reference variable
		
		s1.stateculture();
		s1.stateExamPattern();
		s1.statelanguage();
		s1.subjectList();
		StateBoard.statemarksSystem();
		System.out.println("=================");
		
		CentralBoard c1 = (CentralBoard) s1; //1 interface ref variable type cast into another interface ref variable
		c1.centralculture();
		c1.centralExamPattern();
		c1.centrallanguage();
		c1.subjectList();
		CentralBoard.centralmarksSystem();
		System.out.println("=================");
		
		InternationalBoard b1 = (InternationalBoard) c1; ////1 interface ref variable type cast into another interface ref variable
		b1.interculture();
		b1.interExamPattern();
		b1.interlanguage();
		b1.subjectList();
		InternationalBoard.intermarksSystem();
		System.out.println("=================");
		
	}

}
