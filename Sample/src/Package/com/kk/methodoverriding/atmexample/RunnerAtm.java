package Package.com.kk.methodoverriding.atmexample;

public class RunnerAtm {
	public static void main(String[] args) {
		SbiAtm s=new SbiAtm();
		s.withdraw();
		System.out.println("---------------------------------");
		PaytmBankAtm p= new PaytmBankAtm();
		p.withdraw();
		System.out.println("---------------------------------");
		AxisAtm a=new AxisAtm();
		a.withdraw();
	}
	

}
