package Package.com.kk.interfaceloosecoupling;

public class Oracle implements JDBC {

	@Override
	public void getConnection(String username, String password) {
		System.out.println("Connected to Oracle database using username and password");

	}

	@Override
	public void getTable() {
		System.out.println("Retriving tables from Oracle using select * from tab; Query");

	}

}
