package corejava;

public class Amazon {

	public static void main(String[] args) {
		
		System.out.println("Login to Amazon");
		
		Amazon.Order();
		Amazon.ViewProducts();
		Amazon.Payments();
		Amazon.AddToCart();
		
		System.out.println("Logout from Amazon");
		
		
		
	}
	public static void Order() {
		System.out.println("Order Placed Succesfully");
		
	}
	public static void ViewProducts() {
		System.out.println("Products Viewed");
		
	}
	public static void Payments() {
		System.out.println("Payment Succesfull");
		
	}
	public static void AddToCart() {
		System.out.println("Added To Cart");
		
	}

}
