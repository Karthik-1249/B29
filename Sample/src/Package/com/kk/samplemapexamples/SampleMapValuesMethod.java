package Package.com.kk.samplemapexamples;

import java.util.Collection;
import java.util.HashMap;

public class SampleMapValuesMethod {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "abc");
		map.put(2, "xyz");
		map.put(3, "mno");

		// 1st way using for each on map
		map.forEach((k, v) -> {
			System.out.println(v);
		});

		// 2nd way using values method on map
		Collection<String> values = map.values();
		System.out.println(values);
		for (String s : values) {
			System.out.println(s);
		}

	}

}
