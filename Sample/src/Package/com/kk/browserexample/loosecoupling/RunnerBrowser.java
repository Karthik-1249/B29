package Package.com.kk.browserexample.loosecoupling;

public class RunnerBrowser {
	public static void main(String[] args) {
		WebDriver W = new FirefoxDriver();
		W.get("https://www.google.co.in/");
		W.quit();
		WebDriver c = new ChromeDriver();
		c.get("https://www.google.co.in/");
		c.quit();

	}
}
