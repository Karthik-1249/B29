package Package.com.kk.stringexamples;

public class MethodsOfStringClass {
	public static void main(String[] args) {
		String name = "Hello World";
		System.out.println(name.length()); // returns the length of the String including whitespaces
		System.out.println(name.trim()); // trims all the leading and trailing whitespaces
		System.out.println(name.toUpperCase()); // converts to upper case
		System.out.println(name.toLowerCase()); // converts all the characters to lower case
		System.out.println(name.charAt(3)); // The character present in the given index
		System.out.println(name.indexOf('l')); // 2
		System.out.println(name.lastIndexOf('l')); // 9
		System.out.println(name.contains("World")); // true
		System.out.println(name.endsWith("rld"));
		System.out.println(name.startsWith("eld"));
		System.out.println(name.isEmpty());
		System.out.println(name.replace('o', '*'));
		System.out.println(name.replace("Hello", "Good"));
	}

}
