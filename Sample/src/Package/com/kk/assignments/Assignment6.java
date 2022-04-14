package Package.com.kk.assignments;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = x++;
		int z = --x;
		if (++x != 12 && --y >= 10 && z++ >= 6) {
			System.out.println("Hello");
		} else {
			System.out.println("World");
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}

	}

}
