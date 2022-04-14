package Package.com.kk.staticmetodexplanation;

public class PayPal {

	static void acceptPayment(String upiAddress) {
		if (upiAddress != null && upiAddress.contains("@")) {
			System.out.println("Valid payment");
		} else {
			System.out.println("payment not successful");
		}
	}
}

