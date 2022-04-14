package Package.com.kk.sampleconstructorchaining;

public class Car {
	String brand = "Rolls Royce";
	String color;
	char variant;
	double mileage;

	Car(String brand, String color, char variant, double mileage) {
		this.brand = brand;
		this.color = color;
		this.variant = variant;
		this.mileage = mileage;
	}

	Car(String color, char variant, double mileage) {
		this("Rolls Royce", color, variant, mileage);
	}

	Car(String color) {
		this("Rolls Royce", color, 'P', 5.5);
	}

	Car() {
		this("Rolls Royce", "Black", 'D', 5.0);
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", variant=" + variant + ", mileage=" + mileage
				+ "]";
	}

	public static void main(String[] args) {
		Car a = new Car("Red", 'd', 7.5);
		System.out.println(a);
		Car a2 = new Car("White");
		System.out.println(a2);
		Car a3 = new Car();
		System.out.println(a3);
	}
}
