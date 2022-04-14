package Package.com.kk.objectclassexamples;

public class Narrowing {
	public static void main(String[] args) {
		long l = 130;
		int i = (int) l;
		short s = (short) i;
		byte b = (byte) s;
		System.out.println(l + " " + i + " " + s + " " + b);

	}

}
