package Package.com.kk.samplemapexamples;

import java.util.LinkedHashMap;

public class Sample {
	public static void main(String[] args) {
		LinkedHashMap<Long, String> Contacts = new LinkedHashMap<>();
		Contacts.put(987654329L, "Airtel");
		Contacts.put(987632123L, "VI");
		Contacts.put(865343543L, "Airtel");
		Contacts.put(987564321L, "Jio");
		Contacts.put(987563421L, "Idea");
		Contacts.put(987562121L, "Aircel");
		Contacts.put(987568721L, "BPL");

		prinitingList(Contacts);

	}

	public static void prinitingList(LinkedHashMap<Long, String> Contacts) {
		Contacts.forEach((k, v) -> {
			System.out.println(v);
		});
	}

}
