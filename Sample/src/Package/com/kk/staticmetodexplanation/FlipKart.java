package Package.com.kk.staticmetodexplanation;

public class FlipKart {

	int totalNoOfCustomers;
	int averageNoOfDailyCustomers;
	int activeCustomers;

	void acceptPayment(String upiAddress) {
		PayPal.acceptPayment(upiAddress);
	}

	void calculateActiveCustomers() {
		activeCustomers = totalNoOfCustomers - averageNoOfDailyCustomers;
	}

	public static void main(String[] args) {
		FlipKart f = new FlipKart();
		f.acceptPayment("mahesh@okaxis");
	}
}

