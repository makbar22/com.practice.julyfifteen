package StringPractice;

public class StringBasics05102020 {

	public static void main(String[] args) {
		
// String
		String st1 = "elephant";
		String st2 = new String(" Elephant");

	// METHODS

		// length METHOD - returns the length of characters in a String
		System.out.println(st1.length());

		// charAt METHOD - returns the character at a particular index
		System.out.println(st1.charAt(3));

		// indexOf METHOD - return the index of a particular character - four different
		// signatures below
		System.out.println(st1.indexOf('e')); // return the index of a particular character (first occurrence)
		System.out.println(st2.indexOf('e', 1)); // same character but different location
		System.out.println(st2.indexOf('z', 1)); // we don't have -1 index that means z doesn't exist
		System.out.println(st2.indexOf("ph", 0));// using String instead of character

		// subString METHOD - returns specified section of the String
		System.out.println(st2.substring(3)); // starts from index 3
		System.out.println(st2.substring(0, 1)); // starts and ends
		System.out.println(st2.substring(5, 8));

		// PRACTICE - I want to return"ant" from st2 without any hard coded value except
		// "ant"
		System.out.println(st2.substring(st2.indexOf("ant"), st2.indexOf("ant") + "ant".length()));

		// toLowerCase and toUpperCase METHOD - changes the capitalization of characters
		System.out.println(st2.toLowerCase());
		System.out.println(st2.toUpperCase());

		// equals METHOD - compare two strings considering the case sensitivity of
		// characters
		System.out.println(st2.contentEquals(st1));

		// equalsIgnoreCase METHOD - compare two strings not considering the case
		// sensitivity of characters
		System.out.println(st2.equalsIgnoreCase(st1));

		// startsWith METHOD - will check to see if the string starts with the specified
		// string
		System.out.println(st2.startsWith("e"));

		// endstsWith METHOD - will check to see if the string ends with the specified
		// string
		System.out.println(st2.endsWith("e"));

		// contains METHOD - will check to see if the string contains the specified
		// string/chars
		System.out.println(st2.contains("phan"));

		// replace MEHTOD - will replace
		System.out.println(st1.replace('e', 'E')); // all chars or string
		System.out.println(st1.replace("pha", "AHP")); // sequence
		
		// trim METHOD - remove spaces before and after the String
		System.out.println(st2.trim());
		
		
	//METHOD CHAINING - apply methods to result of another method and so on...
	
	//MUTATION - will change the main object in the memory, whereas with immutable object, they will be stored in a new location in memory
		
		
	}

}
