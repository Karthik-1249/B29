package Package.com.kk.bankexample.loosecoupling;

public class DbsBank implements UPI {

	@Override
	public void checkBalance() {
		System.out.println("Retrieving balance fron dbs Bank Account");

	}

	@Override
	public void transferMoney() {
		System.out.println("Transferring Money from DBS Bank");

	}

	// Sub class specific method
	public void orderCheckBook() {
		System.out.println("Ordering Checkbook from dbs Bank Account");
	}
}
