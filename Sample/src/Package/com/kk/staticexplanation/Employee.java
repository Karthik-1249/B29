package Package.com.kk.staticexplanation;

public class Employee {
	static String companyName = "Google";
	String name;
	double salary;

	void work() {
		System.out.println("Working.....");
	}

	static void show() {
		System.out.println("Show method");
	}

	public static void main(String[] args) {
		Employee.show();
		System.out.println(Employee.companyName);
		Employee e1 = new Employee();
		System.out.println(e1.name);
		Employee e2 = new Employee();
		e2.companyName = "Alphabet";
		System.out.println(e1.companyName); // Alphabet
		Employee.companyName = "Beta";//no change.
		System.out.println(Employee.companyName);

	}

}
