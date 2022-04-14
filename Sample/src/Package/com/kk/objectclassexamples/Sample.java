package Package.com.kk.objectclassexamples;

public class Sample {
	{
		System.out.println("Block 1");
	}

	{
		System.out.println("Block 2");
	}

	Sample() {
		System.out.println("Constructor sample");
	}

	public static void main(String[] args) {
		Sample s = new Sample();
	}

}
