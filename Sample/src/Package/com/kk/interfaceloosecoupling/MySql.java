package Package.com.kk.interfaceloosecoupling;

public class MySql implements JDBC {

	@Override
	public void getConnection(String username, String password) {
		System.out.println("Connecting to MySql database using username and password");

	}

	@Override
	public void getTable() {
		System.out.println("Retrieving Data from MySql database using show tables; query");

	}

}
