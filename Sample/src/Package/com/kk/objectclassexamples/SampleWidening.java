package Package.com.kk.objectclassexamples;

public class SampleWidening {
	public static void main(String[] args) {
		byte b = 120;
		short s = b;
		int i = s;
		long l = i;
		System.out.println(b + " " + s + " " + i + " " + l);
	}

}
