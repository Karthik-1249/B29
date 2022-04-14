package Package.com.kk.methodoverriding.tostringoverrdingexamples;

public class Chocolate extends Object {
	String brandName;
	int price;

	@Override
	public String toString() {
		return "Chocolate [brandName=" + brandName + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		Chocolate c = new Chocolate();
		c.brandName = "Cadbury";
		c.price = 50;
		System.out.println(c);

		Chocolate c2 = new Chocolate();
		c2.brandName = "Kitkat";
		c2.price = 50;
		System.out.println(c2);

	}

}
