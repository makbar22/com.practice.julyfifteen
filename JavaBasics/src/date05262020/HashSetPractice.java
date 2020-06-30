package date05262020;

import java.util.HashSet;
import java.util.Set;

import date05032020.forEACHLoop;

public class HashSetPractice {

	public static void main(String[] args) {

		String[] data = { "Test", "Data", "Automation", "Test", "Data" };

		outter: for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i].contentEquals(data[j])) {
					System.out.println("duplicate " + data[i]);
					break outter;

				}
			}
		}

		System.out.println(
				"***************************************** Using Set to find duplicate*****************************************");

		Set<String> temp = new HashSet<String>();// upcasting polymorphism
		int count = 0; // this is only if we want to print the second duplicate not first one
		for (String i : data) {
			if (temp.add(i) == false) { // add returns boolean, if false, it means there is duplicate
				count++;
				if (count > 1) {
					System.out.println("Duplicate found using set = " + i);
					break; // to stop after the first duplicate is found

				}
			}
		}
		if (count < 2) {
			System.out.println(" there is 0 - 1 duplicate");	// will tell you how many duplicates are there and we can change the values
		}
	}
}
