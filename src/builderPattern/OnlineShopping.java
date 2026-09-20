package builderPattern;

public class OnlineShopping {

	public static void main(String[] args) {

		ShoppingApp order01 = new ShoppingApp();
		
		order01.login(1122334455)
			.searchProduct("Arctic Hunter Bagpack")
				.addToCart("Arctic Hunter Bagpack")
					.makePayment("abc@upi")
						.placeOrder("ABCD1234")
							.sentmail()
								.logout();
		
		order01.orderDetails(order01.OrderID);
								
								
		
	}

}
