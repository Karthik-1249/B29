package Package.com.kk.stringexamples;

public class ExampleStringBuilder {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		s.append("Hello world Morning");
		System.out.println(s); // Hello world Morning
		System.out.println(s.length()); // 19
		System.out.println(s.capacity()); // 34

		StringBuilder sb = new StringBuilder("Hello"); // 16 + length of given String(5)
		System.out.println(sb.capacity()); // 16+5 -> 21
		//System.out.println(sb.isempty());
		System.out.println(sb.charAt(1));
	}

}
