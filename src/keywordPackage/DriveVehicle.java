package keywordPackage;

public class DriveVehicle {

	public static void main(String[] args) {

		Volvo v1 = new Volvo();
		v1.start();
		v1.stop();
		v1.features();
		System.out.println("===========================");
		
		Volvo v2 = new Volvo(10);
		
		System.out.println("===========================");
		
		Volvo v3 = new Volvo(10, 20);

	}

}
