package methodConcepts;

import java.util.ArrayList;

public class TransaportSystems {

	// method to define transportation facilities available in city and return
	// ArrayList of all facilities

	public ArrayList<String> transportfacility(String cityname) {
		System.out.println("Transportation facilities available in City: " + cityname);
		ArrayList<String> transportOptions = new ArrayList<>();

		if (cityname.equals("Mumbai")) {
			transportOptions.add("Local - 3 lines");
			transportOptions.add("CityBus - BEST");
			transportOptions.add("IndianRailway");
			transportOptions.add("MonoRail");
			transportOptions.add("MetroRail");
			transportOptions.add("Bullet Train");
			transportOptions.add("Airports - 2");
			transportOptions.add("Shipyard");
			transportOptions.add("Private - Taxi, Auto");
		} else if (cityname.equals("Pune")) {
			transportOptions.add("Local - 1 line");
			transportOptions.add("CityBus - PMPCML");
			transportOptions.add("IndianRailway");
			transportOptions.add("MetroRail");
			transportOptions.add("Airports - 1");
			transportOptions.add("Private - Auto");
		} else if (cityname.equals("Kolhapur")) {
			transportOptions.add("CityBus - KMT");
			transportOptions.add("IndianRailway");
			transportOptions.add("Airports - 1");
			transportOptions.add("Private - Auto");
		} else {
			System.out.println("Please enter correct city name");
		}
		return transportOptions;

	}

	public static void main(String[] args) {
		TransaportSystems trans = new TransaportSystems();
		ArrayList<String> t1 = trans.transportfacility("Kolhapur");
		System.out.println("Options: " + t1);
		System.out.println("Total Options: " + t1.size());
		System.out.println("=============================");

		ArrayList<String> t2 = trans.transportfacility("Pune");
		System.out.println("Options: " + t2);
		System.out.println("Total Options: " + t2.size());
		System.out.println("=============================");

		ArrayList<String> t3 = trans.transportfacility("Mumbai");
		System.out.println("Options: " + t3);
		System.out.println("Total Options: " + t3.size());
		System.out.println("=============================");

		ArrayList<String> t4 = trans.transportfacility("Baner");
		System.out.println("Options: " + t4);
		System.out.println("Total Options: " + t4.size());
		System.out.println("=============================");
	}

}
