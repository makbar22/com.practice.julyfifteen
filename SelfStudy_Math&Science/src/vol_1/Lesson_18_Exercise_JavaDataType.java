package vol_1;

public class Lesson_18_Exercise_JavaDataType {

	public static void main(String[] args) {

		
		long distance;
		int minutes;

		minutes = 300;
		distance = 186282L * minutes * 60; // if we don't add L it'll take it as an integer because the two numbers ar
											// literal that are typed in and Java will take everything as an integer
											// because minutes is the only initialized value and it's integer.

		System.out.println("The distance travel within 300 minutes is: " + distance + " miles.");

	}

}
