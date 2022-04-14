package Package.com.kk.sampledynamicarray;

public class Sample {
	public static void main(String[] args) {
		int[] marks = { 10, 20, 30, 40, 50 };
		System.out.println(marks);// [I@5345345
		System.out.println(marks.length);
		System.out.println(marks[1]);
		// System.out.println(marks[10]); // ArrayIndexOutOfBoundsException
		for (int i : marks) {
			System.out.print(i + " ");
		}
	}

}
