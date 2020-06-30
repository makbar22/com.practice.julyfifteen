package date05282020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import date05032020.forEACHLoop;

public class HashMapPractice {

	public static void main(String[] args) {

		Map<Integer, ArrayList<ArrayList<String>>> data = new HashMap<Integer, ArrayList<ArrayList<String>>>();

		data.put(1, new ArrayList<ArrayList<String>>()); // creating outter arraylist

		data.get(1).add(new ArrayList<String>()); // adding the first inside arraylist
		data.get(1).add(new ArrayList<String>()); // creating the second inside arraylist
		data.get(1).add(new ArrayList<String>());	//this will print an empty arraylist
		
		
		data.get(1).get(0).add("Java"); // because array list inside an arraylist refer to picture.
		data.get(1).get(0).add("Test");
		data.get(1).get(0).add("Automation");

		data.get(1).get(1).add("Jack"); // because array list inside an arraylist refer to picture.
		data.get(1).get(1).add("Ben");
		data.get(1).get(1).add("Mike");

		System.out.println(data);

		for (Integer mapKeys : data.keySet()) {
			// data.get(mapKeys); this gives the ArrayList<ArrayList>String>>

			for (ArrayList<String> innerLists : data.get(mapKeys)) {
				// System.out.println(innerLists); // if we want two of the them

				for (String values : innerLists) { // if we want to print them outside array list
					System.out.print(values + "  ");
				}
				System.out.println();
			}

		}

	}

}
