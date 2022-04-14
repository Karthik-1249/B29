package Package.com.kk.programlogics;

import java.util.Scanner;

public class StarK {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N Value - ");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				//if (j == n / 2 || (i + j == n - 1 && j >= n / 2) || (i == j && j >= n / 2)) //printing k
				if ((j==0)||(j==n-1)||i==0||i==n/2||i==n-1){
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}

}
