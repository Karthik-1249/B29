package Package.com.kk.methodoverriding.vehicleexample;

public class RunnerVehicle {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		Truck t = new Truck();
		t.start();

	}

}
