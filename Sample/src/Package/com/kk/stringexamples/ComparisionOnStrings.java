package Package.com.kk.stringexamples;

public class ComparisionOnStrings {
	public static void main(String[] args) {
		String a = new String("hello");
		String x = "hello";
		String y = "hello";
		String z = "Hello";

		String passwordInDB = "Hello@123";
		String passwordEnteredInWebsite = "hello@123";
		System.out.println(passwordEnteredInWebsite.equals(passwordInDB)); // false

		System.out.println(a == y); // false
		System.out.println(a.equals(y)); // true
		System.out.println(x == z); // false
		System.out.println(x == y); // true
		System.out.println(x.equals(z)); // false
		System.out.println(x.equalsIgnoreCase(z)); // true
	}

}
