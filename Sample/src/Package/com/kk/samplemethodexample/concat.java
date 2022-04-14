package Package.com.kk.samplemethodexample;

public class concat {
	String s1 = "Good";
	String s2 = "Morning";

	double findSimpleInterest(int x, int y, double z) {
		double SI = (x * y * (z / 100));
		return SI;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		concat c1 = new concat();
		System.out.println(c1.s1 + " " + c1.s2);
		double value = c1.findSimpleInterest(100000, 1, 5);
		System.out.println(value);
	}

}
