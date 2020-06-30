package date05292020;

import java.util.*;

public class DataStructure {

	public static void main(String[] args) {

		HashMap<String, String> countryCity = new HashMap<String, String>();

		countryCity.put("US", "Virginia");
		countryCity.put("US", "Florida");

		countryCity.put("France", "Paris");
		countryCity.put("Russia", "Moscow");
		countryCity.put("Philippines", "Mania");

		for (String outer : countryCity.keySet()) {
			System.out.println(outer + ": " + countryCity.get(outer));
		}

		ArrayList<Integer> ar1 = new ArrayList<Integer>();

		ar1.add(1);
		ar1.add(2);
		ar1.add(3);

		Iterator<Integer> it = ar1.iterator();

		while (it.hasNext()) {
			int num = it.next();
			System.out.println(num);
		}
	}
}
