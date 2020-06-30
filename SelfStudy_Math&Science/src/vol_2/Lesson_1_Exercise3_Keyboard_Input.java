package vol_2;

public class Lesson_1_Exercise3_Keyboard_Input {

	public static void main(String[] args)

			throws java.io.IOException {

		char input;
		int output;

		System.out.println("Type in any Lowercase letter: ");

		input = (char) System.in.read(); // casting input as char so it gives us a character not a number
		output = input - 32;

		System.out.println("You typed in the letter: " + input + ". The uppercase version is: " + (char) output);
		// casting the integer output into char to giveF us a character not a number
	}
}
