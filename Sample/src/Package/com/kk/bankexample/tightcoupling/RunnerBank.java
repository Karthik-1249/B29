package Package.com.kk.bankexample.tightcoupling;

public class RunnerBank {
	public static void main(String[] args) {
		CitiBank c=new CitiBank();
		c.checkBalance();
		c.sendMoney();
	}
}
