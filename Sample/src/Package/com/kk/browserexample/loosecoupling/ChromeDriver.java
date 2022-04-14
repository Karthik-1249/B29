package Package.com.kk.browserexample.loosecoupling;

public class ChromeDriver implements WebDriver {
	public void get(String url) {
		System.out.println("Opening Google Website");
	}

	public void quit() {
		System.out.println("Closing the Chrome Browser");
	}

}
