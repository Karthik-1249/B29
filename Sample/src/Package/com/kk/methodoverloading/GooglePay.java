package Package.com.kk.methodoverloading;

public class GooglePay {
	void pay(String upiAddress) {
		if (upiAddress != null && !upiAddress.equals("") && upiAddress.contains("@")) {
			System.out.println("Payment successfull using upiAddress "+upiAddress);
		} else {
			System.out.println("Payment not successfull using upiAddress "+upiAddress);
		}
	}

	void pay(Account account) {
		if (account != null) {
			System.out.println("Payment successfull for account "+account);
		} else {
			System.out.println("Payment not successfull for account "+account);
		}
	}

	void pay(QRCode qRCodeScan) {
		if (qRCodeScan != null) {
			System.out.println("Payment successfull for qRCodeScan "+qRCodeScan);
		} else {
			System.out.println("Payment not successfull for qRCodeScan "+qRCodeScan);
		}
	}

	void pay(long phoneNumber) {
		if (phoneNumber == 9876543210l) {
			System.out.println("Payment successfull using phoneNumber "+phoneNumber);
		} else {
			System.out.println("Payment Not successfull using phoneNumber "+phoneNumber);
		}
	}

	public static void main(String[] args) {
		GooglePay g = new GooglePay();
		String address = "Karthikeyan@abc";
		g.pay(address);
		Account a = new Account("Karthikeyan", 9898989023432l, "abcdef");
		g.pay(a);
		QRCode q = new QRCode("TestQRCode");
		g.pay(q);
		g.pay(9876543210l);
	}
}
