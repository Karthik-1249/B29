package Package.com.kk.upcastingdowncastingexamples;

public class Shop {
	Fruit sell(String fruitName) {
		// To avoid null pointer exception
		if (fruitName != null) {
			if (fruitName.equalsIgnoreCase("PineApple")) {
				PineApple p = new PineApple();
				return p;
			} else if (fruitName.equalsIgnoreCase("Apple")) {
				Apple a = new Apple();
				return a;
			} else if (fruitName.equalsIgnoreCase("Grape")) {
				Grape g = new Grape();
				return g;
			}

		}
		return null;
	}

	public static void main(String[] args) {
		Shop s = new Shop();
		Fruit f = s.sell("grape");
		if (f != null) {
			f.preparejuice();
			// instanceof operator is used to avoid ClassCastException
			if (f instanceof Grape) {
				Grape g = new Grape();
				g.prepareWine();
			} else if (f instanceof PineApple) {
				PineApple p = new PineApple();
				p.prepareDessert();
			} else if (f instanceof Apple) {
				Apple a = new Apple();
				a.prepareSalad();
			}
		} else {
			System.out.println("No Such Fruit");
		}

	}
}