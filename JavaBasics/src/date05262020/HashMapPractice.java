package date05262020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {

		Map<Integer, String> data = new HashMap<Integer, String>(); // integer for the key and String for the data

		data.put(1, "jack");
		data.put(2, "ben"); // put method is used to add values

		System.out.println(data.get(2)); // method get will retrieve key 2.
		System.out.println(data.keySet()); // method keySet returns all keys
		System.out.println(data.values()); // method values returns all values

		System.out.println(data); // everything

		String[] x = { "b", "a" };

		System.out.println(x);

		Map<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

		ArrayList<String> m2020 = new ArrayList<String>();
		m2020.add("Jack");
		m2020.add("Ben");
		m2020.add("Kevin");

		hm.put("Feb2020", new ArrayList<String>());
		hm.put("May2020", m2020);

		hm.get("Feb2020").add("First student"); // adding values to the arraylist - refer to java day 22
		hm.get("Feb2020").add("Second Student");

		System.out.println(hm);

		System.out.println(hm.get("Feb2020"));
		System.out.println(hm.get("May2020"));

		for (String i : hm.get("May2020")) { // iterating one by one
			System.out.println(i);

		}

	}
}
