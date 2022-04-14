package Package.com.kk.inheritanceexample1;

public class Runner {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.breed = "RAJAPALAYAM DOG";
		d.gender = 'M';
		d.color = "BROWN";
		d.name = "KALABAIRAVA";
		d.age = 2;
		System.out.println(d);
		d.bark();
		d.eat();
		System.out.println("_________________________________________");
		Cat c = new Cat();
		c.breed = "HIMALAYAN CAT";
		c.gender = 'F';
		c.color = "WHITE";
		c.name = "JULIE";
		c.age = 1;
		System.out.println(c);
		c.eat();
		c.scratch();
		c.sleep();

	}
}
