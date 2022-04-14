package Package.com.kk.encapsulation;

public class RunnerBankAccount {
	public static void main(String[] args) {
	BankAccount b=new BankAccount();
	b.setAccountHolderName("Karthikeyan K");
	System.out.println(b.getAccountHolderName());
	b.setAccountNumber(989890238423l);
	System.out.println(b.getAccountNumber());
	b.setAccountType("Savings");
	System.out.println(b.getAccountType());
	b.setBalance(23424);
	System.out.println(b.getBalance());
	b.setIfscCode("HDFC00012312");
	System.out.println(b.getIfscCode());
	}
}
