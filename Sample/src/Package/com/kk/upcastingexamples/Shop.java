package Package.com.kk.upcastingexamples;

public class Shop {
	Weapon sellweapon(String weaponName) {
		// To avoid null pointer exception
		if (weaponName != null) {
			if (weaponName.equalsIgnoreCase("Gun")) {
				Gun g = new Gun();
				return g;
			} else if (weaponName.equalsIgnoreCase("Bomb")) {
				Bomb b = new Bomb();
				return b;
			} else if (weaponName.equalsIgnoreCase("Knife")) {
				Knife k = new Knife();
				return k;
			}

		}
		return null;
	}

	public static void main(String[] args) {
		Shop s = new Shop();
		Weapon w = s.sellweapon("Gun"); // Weapon w = new Gun();
		if (w != null) {
			w.clean();
			// instanceof operator is used to avoid ClassCastException
			if (w instanceof Gun) {
				Gun g = (Gun) w;
				g.shoot();
			} else if (w instanceof Bomb) {
				Bomb b = (Bomb) w;
				b.blast();
			} else if (w instanceof Knife) {
				Knife k = (Knife) w;
				k.stab();
			}
		} else {
			System.out.println("No such weapon");

		}
	}
}
