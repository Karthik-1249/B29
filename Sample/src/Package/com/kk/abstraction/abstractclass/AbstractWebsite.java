package Package.com.kk.abstraction.abstractclass;

public abstract class AbstractWebsite {
	public void register() {
		System.out.println("Register Successfully");
	}

	public void logout() {
		System.out.println("Logout Successfully");
	}

	abstract void login();

}
