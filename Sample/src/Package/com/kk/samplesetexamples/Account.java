package Package.com.kk.samplesetexamples;

import java.util.HashSet;

public class Account {
	int accountNo;
	String accountHolderName;
	long phoneNumber;
	boolean isActive;
	double balance;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountNo != other.accountNo)
			return false;
		return true;
	}

	public Account(int accountNo, String accountHolderName, long phoneNumber, boolean isActive, double balance) {
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.phoneNumber = phoneNumber;
		this.isActive = isActive;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNo = " + accountNo + ", accountHolderName = " + accountHolderName + ", phoneNumber = "
				+ phoneNumber + ", isActive = " + isActive + ", balance = " + balance + "]\n";
	}

	public static void main(String[] args) {
		Account a1 = new Account(12345, "Karthikeyan K", 8978897987L, true, 10298384);
		Account a2 = new Account(344242, "Mahesh", 9876546789L, true, 9889890);
		Account a3 = new Account(88573, "Murugan", 9878987898L, false, 9890980);
		Account a4 = new Account(88573, "Murugan", 9878987898L, false, 9890980);
		Account a5 = new Account(88573, "Murugan", 9878987898L, false, 9890980);
		Account a6 = new Account(88574, "Praveen", 9878387898L, true, 9890980);
		HashSet<Account> Accounts = new HashSet<>();
		Accounts.add(a1);
		Accounts.add(a2);
		Accounts.add(a3);
		Accounts.add(a4);
		Accounts.add(a5);
		Accounts.add(a6);
		System.out.println("Total Size - " + Accounts.size());
		System.out.println();
		System.out.println(Accounts);
	}

}
