package Package.com.kk.stringexamples;

public class SplitExample {
	public static void main(String[] args) {
		String message = "Hello World Good Morning";
		System.out.println(message.length()); // 24

		String[] words = message.split(" ");
		System.out.println(words.length);// 4
		System.out.println(words[3]); // Morning
	}

}
