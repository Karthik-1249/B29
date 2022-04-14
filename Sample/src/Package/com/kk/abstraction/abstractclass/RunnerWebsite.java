package Package.com.kk.abstraction.abstractclass;

public class RunnerWebsite {
	public static void main(String[] args) {
		AbstractWebsite a = new Website();
		a.register();
		a.login();
		a.logout();
	}

}
