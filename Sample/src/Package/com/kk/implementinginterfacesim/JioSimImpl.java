package Package.com.kk.implementinginterfacesim;

public class JioSimImpl implements ISim {

	@Override
	public void call() {
		System.out.println("calling");

	}

	@Override
	public void sms() {
		System.out.println("SMS");

	}

	@Override
	public void browse() {
		System.out.println("Browse");

	}

	public void jioTv() {
		System.out.println("JioTv");
	}
}
