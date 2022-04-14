package Package.com.kk.samplearraylistexamples;

import java.util.ArrayList;

public class SampleHomogenous {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Mahesh");
		names.add("Karthik");
		names.add("Pavan");
		names.add("Mahesh");
		names.add(null);
		names.add(null);
		names.add("Karthik");

		System.out.println(names);

	}

}
