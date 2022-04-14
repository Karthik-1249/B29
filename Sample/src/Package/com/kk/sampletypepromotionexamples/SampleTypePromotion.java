package Package.com.kk.sampletypepromotionexamples;

public class SampleTypePromotion {
	static void show(int value) {
		System.out.println("int method value is " + value);
	}

	public static void main(String[] args) {
		char x = 'a'; // 97
		show(x); // show(char c)
	}

}
