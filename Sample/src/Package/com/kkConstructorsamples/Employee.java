package Package.com.kkConstructorsamples;

public class Employee {
	String name;
	int eid;

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Karthikeyan K";
		e.eid = 1249;
		System.out.println(e.name);
		System.out.println(e.eid);
		Employee e1 = new Employee();
		e1.name = "Praveenkumar K";
		e1.eid = 7777;
		System.out.println(e1.name);
		System.out.println(e1.eid);

	}

}
