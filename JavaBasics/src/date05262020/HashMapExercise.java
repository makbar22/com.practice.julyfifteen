package date05262020;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class HashMapExercise {

	public static void main(String[] args) {

		// create a hashmap that takes integer keys, and list of the things you like
		// about java
		// add keys 1 - 5, and add a list of things that you like in that degree about
		// java

		Map<Integer, ArrayList<String>> hw = new HashMap<Integer, ArrayList<String>>(); // left of equation is
																						// declaration of Class, right
																						// of equation we instantiate
																						// new object of the class

		ArrayList<String> al1 = new ArrayList<String>(); // creating 5 different ArrayList
		ArrayList<String> al2 = new ArrayList<String>();
		ArrayList<String> al3 = new ArrayList<String>();
		ArrayList<String> al4 = new ArrayList<String>();
		ArrayList<String> al5 = new ArrayList<String>();

		hw.put(1, al1); // connecting keys to their particular values
		hw.put(2, al2);
		hw.put(3, al3);
		hw.put(4, al4);
		hw.put(5, al5);

		hw.get(1).add("JVM");
		hw.get(1).add("JDK");
		hw.get(1).add("IDE");
		hw.get(1).add("JAVA Method");

		hw.get(2).add("Byte");
		hw.get(2).add("Code");

		hw.get(3).add("Variable");
		hw.get(3).add("Operators");
		hw.get(3).add("Expression");

		hw.get(4).add("Assignment");
		hw.get(4).add("Equality");

		hw.get(5).add("Block");
		hw.get(5).add("Line");
		hw.get(5).add("Intialize");

		System.out.println("This includes all five keys and values: " + hw);
		System.out.println("This includes key (1) and it's ArrayList: " + hw.get(1));
		System.out.println("This includes key (2)  and it's ArrayList: " + hw.get(2));
		System.out.println("This includes key (3) and it's ArrayList: " + hw.get(3));
		System.out.println("This includes key (4) and it's ArrayList: " + hw.get(4));
		System.out.println("This includes key (5) and it's ArrayList: " + hw.get(5));

		for (int outter : hw.keySet()) {
			for (String inner : hw.get(outter)) {
				System.out.println(inner);
			}
		}
	}
}
