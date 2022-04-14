package Package.com.kk.association;

public class Student {
	int sNo;
	Name name;
	Address address;

	// When class is the datatype, object of that class is the data
	// default zero param constructor will be given by compiler
	@Override
	public String toString() {
		return "Student [sNo=" + sNo + ", name=" + name + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.sNo = 40;
		s.name = new Name("Karthik", "Mahesh", "Murugan");
		s.address = new Address(34, "4th main", "Bangalore", 560078);
		System.out.println();
		System.out.println(s.name.middleName);
		System.out.println(s.address.city);
	}

}
