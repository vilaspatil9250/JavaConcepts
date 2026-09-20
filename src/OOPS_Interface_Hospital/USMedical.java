package OOPS_Interface_Hospital;

//Interface can have multiple inheritance - can extends multiple interfaces
public interface USMedical extends WHO, USHealth {

	public void nuroService();
	public void emergency();
}
