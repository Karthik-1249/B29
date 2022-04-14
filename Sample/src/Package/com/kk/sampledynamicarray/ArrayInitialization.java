package Package.com.kk.sampledynamicarray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInitialization {
	public static void main(String[] args) {
		System.out.println("Enter the size of the Array");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter " + size + " elements to store in the array");
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Enter " + i + " index element in the array");
			nums[i] = s.nextInt();
			System.out.println(Arrays.toString(nums));
		}
		System.out.println("Finall Array values are:");
		System.out.println(Arrays.toString(nums));
	}
}
