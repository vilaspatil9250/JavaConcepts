package builderPattern;

public class ShoppingApp {
	
	public String OrderID;
	
	public ShoppingApp login(int mobileNumber) {
		System.out.println("Login with Mobile Number : "+ mobileNumber);
		return this;
	}

	public ShoppingApp login(String uname, String pwd) {
		System.out.println("Login with user ID : "+ uname + " and Password : " + pwd);
		return this;
	}
	
	public ShoppingApp searchProduct(String productName) {
		System.out.println("Seach for : " + productName);
		return this;
	}
	
	public ShoppingApp addToCart(String productName){
		System.out.println(productName + "Added to card");
		return this;
	}
	
	public ShoppingApp makePayment(String upiID) {
		System.out.println("Make Payment using UPI: " + upiID);
		return this;
	}
	
	public ShoppingApp placeOrder(String OrderID) {
		this.OrderID = OrderID;
		System.out.println("Order placed for : " + OrderID);
		return this;
	}
	
	public ShoppingApp sentmail() {
		System.out.println("Send order details by mail");
		return this;
	}
	
	public ShoppingApp logout() {
		System.out.println("user logged out");
		return this;
	}
	
	public void orderDetails(String OrderID) {
		System.out.println("Your Order ID : " + OrderID);
	}
	
	
}
