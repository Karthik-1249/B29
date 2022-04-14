package Package.com.kk.upcastingwithpolymorphism;

public class RunnerAnimal {
	public static void main(String[] args) {

		Animal a = new Dog();
		a.eat();
		// a.bark(); this is a sub class specific method which is not accessible with
		// reference a, as it is of type Animal
		if (a instanceof Dog) {
			Dog d = (Dog) a;
			d.bark();

		}

	}

}
