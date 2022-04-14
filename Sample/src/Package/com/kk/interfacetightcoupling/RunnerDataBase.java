package Package.com.kk.interfacetightcoupling;

public class RunnerDataBase {
	public static void main(String[] args) {
		Oracle o = new Oracle();
		o.getConnection();
		o.retrieveTable();

		MySql m = new MySql();
		m.getTables();
		m.connectMySql("alpha@123", "alpha@gmail.com");
	}

}
