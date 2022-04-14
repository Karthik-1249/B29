package Package.com.kk.inheritanceexamples;

public class Car extends Vehicle {
	boolean isAutomatic;
	int seatingCapacity;

	void cruizeControl() {
		System.out.println("Car Cruize Control");
	}

	@Override
	public String toString() {
		return "Car [isAutomatic=" + isAutomatic + ", seatingCapacity=" + seatingCapacity + ", brand=" + brand
				+ ", color=" + color + ", yom=" + yom + "]";
	}

}
