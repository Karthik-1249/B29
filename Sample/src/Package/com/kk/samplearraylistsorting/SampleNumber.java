package Package.com.kk.samplearraylistsorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SampleNumber {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(34);
		list.add(5);
		list.add(10);
		System.out.println(list);
		System.out.println("Ascending Order");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Descending Order");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		for (Integer i : list) {
			System.out.println(i + " ");
		}
	}

}
