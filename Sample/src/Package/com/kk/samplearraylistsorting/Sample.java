package Package.com.kk.samplearraylistsorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sample {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Alpha");
		names.add("Beta");
		names.add("Charlie");
		System.out.println("Printing elements in the collection");
		for (String name : names) {
			System.out.println(name + " ");
		}
		System.out.println(names);
		Collections.sort(names);
		System.out.println("After Sorting");
		System.out.println(names);
		System.out.println("Descending Order");
		Collections.sort(names, Collections.reverseOrder());
		System.out.println(names);
	}

}
