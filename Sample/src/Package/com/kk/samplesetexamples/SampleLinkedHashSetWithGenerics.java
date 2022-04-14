package Package.com.kk.samplesetexamples;

import java.util.LinkedHashSet;

public class SampleLinkedHashSetWithGenerics {
	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		set.add(45);
		set.add(56);
		set.add(56);
		set.add(null);
		set.add(null);
		System.out.println(set.size());
		System.out.println(set);

	}

}
