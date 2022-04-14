package Package.com.kk.inheritanceexamples;

public class Bike extends Vehicle {
	int seatingCapacity;

	void kick() {
		System.out.println("Bike Kick Start");
	}

	@Override
	public String toString() {
		return "Bike [seatingCapacity=" + seatingCapacity + ", brand=" + brand + ", color=" + color + ", yom=" + yom
				+ "]";
	}

}
