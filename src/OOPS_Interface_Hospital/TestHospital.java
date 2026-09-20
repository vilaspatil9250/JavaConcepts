package OOPS_Interface_Hospital;

public class TestHospital {

	public static void main(String[] args) {
		
		FortiesHospital f1 = new FortiesHospital();
		f1.covidVaccination();
		f1.USHealthrules();
		f1.cardioService();
		f1.orthoService();
		f1.nuroService();
		f1.emergency();
		f1.GeneralCheckUp();
		Medicine.MedicalNews();
		System.out.println("======================");

		//Top casting - Child class object referred by Parent interface reference variable
		USMedical u1 = new FortiesHospital();
		u1.covidVaccination();
		u1.USHealthrules();
		u1.nuroService();
		u1.emergency();
		
	}

}
