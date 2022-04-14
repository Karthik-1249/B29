package Package.com.kk.constructoroverloading;

public class Spectacle {
	String type;
	double rightEyePower;
	double leftEyePower;
	int cost;

	Spectacle() {
		this.type = "Powerless Computer Glasses";
		this.rightEyePower = 0;
		this.leftEyePower = 0;
		this.cost = 1000;
	}

	Spectacle(String type, double rightEyePower, double leftEyePower, int cost) {
		this.type = type;
		this.rightEyePower = rightEyePower;
		this.leftEyePower = leftEyePower;
		this.cost = cost;
	}

	Spectacle(String type) {
		this.type = type;
		this.rightEyePower = 0;
		this.leftEyePower = 0;
		this.cost = 5000;
	}

	@Override
	public String toString() {
		return "Spectacle [type=" + type + ", rightEyePower=" + rightEyePower + ", leftEyePower=" + leftEyePower
				+ ", cost=" + cost + "]";
	}

	public static void main(String[] args) {
		Spectacle personA = new Spectacle();
		System.out.println(personA);
		Spectacle personB = new Spectacle("Powered Glass", 2.3, 1.2, 2500);
		System.out.println(personB);
		Spectacle personC = new Spectacle("Sun Glasses");
		System.out.println(personC);

	}
}