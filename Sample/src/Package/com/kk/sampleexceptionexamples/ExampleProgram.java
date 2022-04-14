package Package.com.kk.sampleexceptionexamples;

import java.util.Scanner;

public class ExampleProgram {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Numerator");
		int numerator = s.nextInt();
		System.out.println("Enter Denominator");
		int denominator = s.nextInt();
		int result = 0;
		try {
			result = numerator / denominator;
		} catch (ArithmeticException e) {
		}
		System.out.println(result);

	}

}
