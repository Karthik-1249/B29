package Package.com.kk.programlogics;

import java.util.Scanner;

public class StarNcrossN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N Value - ");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");

			}
			System.out.println();

		}
	}

}
