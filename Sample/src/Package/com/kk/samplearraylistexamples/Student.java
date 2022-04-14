package Package.com.kk.samplearraylistexamples;

import java.util.ArrayList;

public class Student {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]\n";
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "Mahesh");
		Student s2 = new Student(2, "amit");
		Student s3 = new Student(3, "Karthik");
		Student s4 = new Student(4, "Priyanka");
		Student s5 = new Student(5, "joker");
		ArrayList<Student> studentList = new ArrayList<>();
		System.out.println(studentList);
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		System.out.println(studentList);
	}
}
