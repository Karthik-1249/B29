package Package.com.kk.upcastingwithpolymorphism;

public class Monkey extends Animal {
	public Monkey() {
		super();
	}

	void eat() {
		System.out.println("Eat with help of hands");
	}

	public static void main(String[] args) {
		Animal a = new Monkey();
		a.eat();
	}
}
