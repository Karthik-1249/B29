package Package.com.kk.objectclassexamples;

public class Laptop {
	double price;
	int noOfCoreProcessors;
	boolean isWindows;

	@Override
	public String toString() {
		return "Laptop - " + price + "," + isWindows + "," + noOfCoreProcessors;
	}

	public Laptop(double price, int noOfCoreProcessors, boolean isWindows) {
		this.price = price;
		this.noOfCoreProcessors = noOfCoreProcessors;
		this.isWindows = isWindows;
	}

	public static void main(String[] args) {
		Laptop l = new Laptop(45678.0, 4, false);
		System.out.println(l);

	}

}
