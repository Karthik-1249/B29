package Package.com.kk.methodoverriding.tostringoverrdingexamples;

public class Mobile {
	String brand;
	int price;
	double screensize;

	// Alt+shift+S+O
	public Mobile(String brand, int price, double screensize) {
		this.brand = brand;
		this.price = price;
		this.screensize = screensize;
	}

	// Alt+shift+S+S
	@Override
	public String toString() {
		return price + " " + brand;
	}

	public static void main(String[] args) {
		Mobile m = new Mobile("Apple", 50000, 5.5);
		System.out.println(m);

	}

}
