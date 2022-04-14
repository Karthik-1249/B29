package Package.com.kk.samplearraylistexamples;

import java.util.ArrayList;

public class Restaurant {
	String name;
	int minPrice;
	boolean isAvailableForOrder;

	@Override
	public String toString() {
		return "\n" + "Restaurant [name=" + name + ", minPrice=" + minPrice + ", isAvailableForOrder="
				+ isAvailableForOrder + "]";
	}

	public Restaurant(String name, int minPrice, boolean isAvailableForOrder) {
		this.name = name;
		this.minPrice = minPrice;
		this.isAvailableForOrder = isAvailableForOrder;
	}

	public static void main(String[] args) {
		Restaurant r1 = new Restaurant("MaduraiMess", 1000, true);
		Restaurant r2 = new Restaurant("TajHotel", 1500, true);
		Restaurant r3 = new Restaurant("LeelaPalace", 10000, true);
		ArrayList<Restaurant> RestaurantList = new ArrayList<>();
		RestaurantList.add(r1);
		RestaurantList.add(r2);
		RestaurantList.add(r3);
		System.out.println(RestaurantList);
	}
}
