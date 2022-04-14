package Package.com.kk.encapsulation;

public class Student {
	private int id;
	private int age;
	private String name;

	// ALt+ shift + S + s -> to generate toString()
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

	// ALT + Shift + S + R -> generate getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
