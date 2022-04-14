package Package.com.kk.inheritanceexamples;

public class Truck extends Vehicle {
	double loadingcapacity;

	void dumpLoad() {
		System.out.println("Truck dump load");
	}

	@Override
	public String toString() {
		return "Truck [loadingcapacity=" + loadingcapacity + ", brand=" + brand + ", color=" + color + ", yom=" + yom
				+ "]";
	}

	

}
