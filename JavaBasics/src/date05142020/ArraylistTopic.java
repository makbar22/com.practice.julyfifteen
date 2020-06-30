package date05142020;

import java.util.ArrayList;

public class ArraylistTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> data = new ArrayList<String>();
		data.add("first");
		data.add("second");
		data.add("third");

		System.out.println(data);

		for (int i = 0; i < data.size(); i++) { // after data we use size instead of lenght for arraylist, after size ()
												// because it's a method
			System.out.println(data.get(i));

		}
		for (String i : data) {
			System.out.println("foreach " + i); // for primitive data type we need to use wrapper class
		}
		ArrayList<Integer> data2 = new ArrayList<Integer>();
		data2.add(18);
		data2.add(17);
		data2.add(16);
		data2.add(15);
		data2.add(14);
		for (Integer i : data2) {
			System.out.println(i);
		}
	}
}
