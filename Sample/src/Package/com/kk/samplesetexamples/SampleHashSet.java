package Package.com.kk.samplesetexamples;

import java.util.LinkedHashSet;

public class SampleHashSet {
	public static void main(String[] args) {
		LinkedHashSet h = new LinkedHashSet<>();
		h.add(13);
		h.add(13);
		h.add(13);
		h.add(12);
		h.add(5);
		h.add(null);
		h.add(null);
		h.add(5.6);
		h.add(8.9);
		h.add("hello");
		System.out.println(h.size());
		System.out.println(h);

	}
}
