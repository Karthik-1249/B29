package Package.com.kk.samplemapexamples;

import java.util.HashMap;

public class SampleMap {
	public static void main(String[] args) {
		HashMap<Long, String> map = new HashMap<>();
		map.put(3454244L, "Alpha@gmail.com");
		map.put(2342323L, "xyz@gmail.com");
		System.out.println(map.put(3454244L, "ABC@gmail.com"));
		System.out.println(map.get(3454244L));
		map.put(null, "mno@gmail.com");
		map.put(null, "pqr@gmail.com");
		map.put(35343424L, null);
		map.put(353342342L, null);
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.containsKey(12345L));
		System.out.println(map.containsValue("pqr@gmail.com"));
		System.out.println(map.isEmpty());
		map.clear();


	}

}
