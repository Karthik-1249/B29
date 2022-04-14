package Package.com.kk.sampleerros;

public class ExampleStackOverflowError {

	static void show() {
		display();
	}

	static void display() {
		show();
	}

	public static void main(String[] args) {
		display();

	}

}
