package Package.com.kk.bankexample.loosecoupling;

public class CitiBank implements UPI {

	@Override
	public void checkBalance() {
		System.out.println("Retrieving balance from Citi Bank Account");

	}

	@Override
	public void transferMoney() {
		System.out.println("Transferring Money from Citi Bank");

	}

}
