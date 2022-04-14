package Package.com.kk.inheritanceexample1;

public class Dog extends Animal {
	void bark() {
		System.out.println("Dog is Barking");
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", gender=" + gender + ", color=" + color + ", name=" + name + ", age=" + age
				+ "]";
	}

}
