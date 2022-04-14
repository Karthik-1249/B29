package Package.com.kk.sampletreemap;

import java.util.Scanner;

public class ExampleArithmeticException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		system.out.println("Enter numerator");
		int x = scanner.nextInt();
		System.out.println("Enter denominator");
		int y = scanner.nextInt();
		try {
			int z = x / y; // throw new ArithmeticException("/ by zero");
			System.out.println(z);
		} catch (ArithmeticException exception) {
			System.out.println("You are dividing by zero please enter some other number");
		}
		System.out.println("Program completely executed");

	}
}
