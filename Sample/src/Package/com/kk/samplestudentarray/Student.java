package Package.com.kk.samplestudentarray;

public class Student {
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "Alpha");
		Student s2 = new Student(2, "Beta");
		Student[] students = new Student[2];
		students[0] = s1;
		students[1] = s2;
		System.out.println(students);// Address of the student array
		System.out.println(students[0]);// Address of the student object,that you have stored
		System.out.println(students[1]);// Address of the s2 object
	}

}
