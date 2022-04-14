package Package.com.kk.sampleexceptionexamples;

public class ExampleChecked {
	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int x = 10 / 0;
		System.out.println("World");

		// checked exception : it will be forced by the compiler to handle the exception

		// unchecked exception : the compiler will not force the programmer to handle
		// the exception, but the programmer must handle the exception

	}

}
