package Package.com.kk.sampledynamicarray;

public class SampleString {
	public static void main(String[] args) {
		String[] names = { "Alpha", "Beta", "Charlie" };
		System.out.println(names.length);// 3
		System.out.println(names[2]);// Charlie
		names[2] = "Delta";
		System.out.println(names[2]);// Delta
	}

}
