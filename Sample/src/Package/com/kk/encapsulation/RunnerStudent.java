package Package.com.kk.encapsulation;

public class RunnerStudent {
	public static void main(String[] args) {
		Student s=new Student();
		s.setAge(15);
		System.out.println(s.getAge());
		s.setName("Alpha");
		System.out.println(s.getName());
		System.out.println(s);
	}

}
