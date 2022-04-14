package Package.com.kk.interfacetightcoupling;

public class MySql {
	void getTables() {
		System.out.println("Show Tables");
	}

	void connectMySql(String username, String password) {
		System.out.println("Connected to MySql using username and password");
	}
}
