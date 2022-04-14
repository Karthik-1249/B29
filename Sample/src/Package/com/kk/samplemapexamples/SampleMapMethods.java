package Package.com.kk.samplemapexamples;

import java.util.HashMap;

public class SampleMapMethods {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "abc");
		map.put(2, "xyz");
		map.put(3, "mno");

		System.out.println(map.size());
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.putAll(map);
		System.out.println(map2.size());
		System.out.println(map.get(3));
		System.out.println(map.get(10));

	}

}
