package Package.com.kk.samplewrapperclasses;

public class SampleTricky {
	static void sample(Integer x) {
		System.out.println("Integer method");
	}

	static void sample(int x) {
		System.out.println("int method");
	}

	public static void main(String[] args) {
		sample(null);
	}

}
