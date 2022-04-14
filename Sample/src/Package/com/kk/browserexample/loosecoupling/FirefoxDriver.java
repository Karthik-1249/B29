package Package.com.kk.browserexample.loosecoupling;

public class FirefoxDriver implements WebDriver {

	@Override
	public void get(String url) {
		System.out.println("Opening Google Website");

	}

	@Override
	public void quit() {
		System.out.println("Closing the Chrome Browser");

	}

}
