package Package.com.kk.sampleconstructorchaining;

public class Sample {
	void show() {
		display("Good Morning");
		System.out.println("show method");
	}

	void display(String message) {
		System.out.println(message + " Displayed");
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.show();
	}

}
