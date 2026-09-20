package methodConcepts;

public class Customer {

	// Req: get customer name. Return bill amount
	// display message if provide customer name is not present in list

	public int bill(String cName) {
		int billamount = 0;
		System.out.println("Customer Name = " + cName);
		if (cName.equals("Rajesh")) {
			billamount = 1000;
		} else if (cName.equals("Mahesh")) {
			billamount = 1500;
		} else if (cName.endsWith("Shyam")) {
			billamount = 900;
		} else {
			billamount = 0;
		}
		return billamount;
	}

	public static void main(String[] args) {

		Customer c1 = new Customer();
		int totalAmount = c1.bill("Vilas");

		if (totalAmount > 0) {
			System.out.println("Total billing for customer = " + totalAmount);
		} else {
			System.out.println("Provided Customer name is not present in the list. So Total Bill  = " + totalAmount);
		}
	}

}
