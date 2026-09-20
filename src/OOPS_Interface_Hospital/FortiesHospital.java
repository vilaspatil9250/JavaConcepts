package OOPS_Interface_Hospital;

public class FortiesHospital extends Medicine implements USMedical, UKMedical, IndianMedical {

	// WHO methods
	@Override
	public void covidVaccination() {
		System.out.println("FH - covidVaccination");
	}

	// USHealth methods
	@Override
	public void USHealthrules() {
		System.out.println("FH - USHealthrules");
	}

	// Indian
	@Override
	public void cardioService() {
		System.out.println("FH - cardioService");
	}

	// UK
	@Override
	public void orthoService() {
		System.out.println("FH - orthoService");
	}

	// US
	@Override
	public void nuroService() {
		System.out.println("FH - nuroService");
	}

	// Common
	@Override
	public void emergency() {
		System.out.println("FH - emergency");

	}

	//Individual Method
	public void GeneralCheckUp() {
		System.out.println("FH - GeneralCheckUp");
	}

}
