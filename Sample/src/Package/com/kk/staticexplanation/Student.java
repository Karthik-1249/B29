package Package.com.kk.staticexplanation;

public class Student {
	static String collegeName = "Oxford";
	int age;

	void study() {
		System.out.println("study");
	}

	public static void main(String[] args) {
		System.out.println(Student.collegeName);
		Student s = new Student();
		System.out.println(s.age);
		s.study();
		System.out.println(Student.collegeName);
		s.collegeName = "ABCD";
		System.out.println(s.collegeName);

	}
}

