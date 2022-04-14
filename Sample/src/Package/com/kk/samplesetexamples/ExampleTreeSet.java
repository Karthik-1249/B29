package Package.com.kk.samplesetexamples;

import java.util.Collections;
import java.util.TreeSet;

public class ExampleTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>(Collections.reverseOrder());
		t.add(34);
		t.add(4);
		t.add(10);
		t.add(6);
		t.add(8);
		t.add(8);
		System.out.println(t);
	}
}
