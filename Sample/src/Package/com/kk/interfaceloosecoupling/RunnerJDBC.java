package Package.com.kk.interfaceloosecoupling;

public class RunnerJDBC {
	public static void main(String[] args) {
		JDBC j = new MySql();
		j.getConnection("Alpha@gmail.com", "alpha@123");
		j.getTable();
	}

}
