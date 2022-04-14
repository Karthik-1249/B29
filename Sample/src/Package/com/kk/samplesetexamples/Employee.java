package Package.com.kk.samplesetexamples;

import java.util.HashSet;

public class Employee {
	int empId;
	String name;
	int salary;

	public Employee(int empId, String name, int salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]\n";
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Mahesh", 567890);
		Employee e2 = new Employee(2, "Karthikeyan", 353454);
		Employee e3 = new Employee(1, "Amit", 5353455);
		Employee e4 = new Employee(4, "Karthikeyan", 456789);

		HashSet<Employee> employees = new HashSet<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		System.out.println(employees);

	}

}
