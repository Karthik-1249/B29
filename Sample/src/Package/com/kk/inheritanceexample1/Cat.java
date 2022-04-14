package Package.com.kk.inheritanceexample1;

public class Cat extends Animal {
	void scratch() {
		System.out.println("Cat is Scratching");
	}

	@Override
	public String toString() {
		return "Cat [breed=" + breed + ", gender=" + gender + ", color=" + color + ", name=" + name + ", age=" + age
				+ "]";
	}

}
