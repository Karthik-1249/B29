package Package.com.kk.bankexample.loosecoupling;

public class RunnerBank {
	public static void main(String[] args) {
		// we cannot create object of interface, but it can act as reference to the
		// implementation class object
		UPI u = new DbsBank();// upcasting
		u.checkBalance();
		u.transferMoney();
		// when we upcast the sub class specific methods cannot be accessed, so we have
		// to downcast
		// avoid class cast exception
		if (u instanceof DbsBank) {
			DbsBank d = (DbsBank) u;
			d.orderCheckBook();
		}

	}
}
