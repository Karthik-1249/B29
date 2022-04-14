package Package.com.kk.inheritanceexamples;

public class Runner {
	public static void main(String[] args) {
		Car c = new Car();
		// System.out.println(c);
		c.brand = "BMW";
		c.color = "RED";
		c.isAutomatic = true;
		c.seatingCapacity = 4;
		c.yom = 2021;
		System.out.println(c);
		c.cruizeControl();
		c.start();
		c.stop();
		System.out.println("_______________________________________");
		Truck t = new Truck();
		t.brand = "ASHOKA";
		t.color = "Brown";
		t.loadingcapacity = 2000;
		t.yom = 2020;
		System.out.println(t);
		t.dumpLoad();
		System.out.println("_______________________________________");
		Bike b = new Bike();
		b.brand = "ASHOKA";
		b.color = "Brown";
		b.seatingCapacity = 2;
		b.yom = 2020;
		b.kick();
		System.out.println(b);

	}
}
