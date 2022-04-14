package Package.com.kk.samplemapexamples;

import java.util.HashMap;

public class Product {
	String name;
	double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]\n";
	}

	public static void main(String[] args) {
		HashMap<Integer, Product> map = new HashMap<>();
		map.put(1, new Product("Laptop", 56789));
		map.put(2, new Product("Mobile", 478392));
		System.out.println(map);
	}

}
