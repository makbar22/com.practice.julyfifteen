package interviewQuestions_06172020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Vowel {

	public static void main(String[] args) {

		// I need some test data
		String data = "This is a test to find some specific character";

		// What is it we are trying to find
		String vowel = "aeiou";

		// I need a counter to count the chars
		int counter = 0;

		//
		for (int i = 0; i < data.length(); i++) {
			if (vowel.contains(String.valueOf(data.charAt(i)))) {
				counter++;

				System.out.println(data.charAt(i));
			}
		}
		System.out.println(counter);

		System.out.println(
				"**************************************Finding out how many times a charater is repeated or word is used************************************");

		char search = 't';
		int charCounter = 0;
		for (int i = 0; i < data.length(); i++) {
			if (data.toLowerCase().charAt(i) == search) {
				charCounter++;

			}
		}
		System.out.println(charCounter);

		// getting unique chars
		System.out.println(getUniqChars(data));
		System.out.println(getUniqChars(data).size());
		ArrayList<Character> dataSet = getUniqChars(data);
		for (int i = 0; i < dataSet.size(); i++) {
			System.out.println(dataSet.get(i) + " : " + countCharRep(data, dataSet.get(i)));

		}

	}

	// End of main method
	// Now I need a function (method) to perform this..
	public static int countCharRep(String str, char search) {

		int charCounter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i) == search) {
				charCounter++;

			}
		}
		return charCounter;
	}

	// Now I want to know how many time each char is repeated
	public static ArrayList<Character> getUniqChars(String str) {
		Set<Character> temp = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			temp.add(str.charAt(i));

		}
		return new ArrayList<Character>(temp);
	}
}