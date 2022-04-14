package Package.com.kk.samplemapexamples;

import java.util.HashMap;
import java.util.Set;

public class SampleMapKeySetMethod {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "abc");
		map.put(2, "xyz");
		map.put(3, "mno");
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		for (Integer i : keys) {
			System.out.println(i * 10);
		}
		System.out.println("for each on map");
		map.forEach((k, v) -> {
			System.out.println(k * 10);
		});

	}
}
