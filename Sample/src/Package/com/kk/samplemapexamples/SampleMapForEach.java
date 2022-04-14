package Package.com.kk.samplemapexamples;

import java.util.HashMap;

public class SampleMapForEach {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "abc");
		map.put(2, "xyz");
		map.put(3, "mno");
		System.out.println(map);
		map.forEach((k, v) -> {
			System.out.println(k);
			System.out.println("Hello " + k + " " + v);
		});

		// syntax for using for each loop on map
		map.forEach((k, v) -> {

		});

	}

}
