package vol_2;

public class Lesson_1_Exercise2_Keyboard_Input {

	public static void main(String[] args)

			throws java.io.IOException {

		char input;

		System.out.println("I'm thinking of a letter between A to Z. Guess the letter: ");

		input = (char) System.in.read();

		if ((input == 'W') || (input == 'w'))
			System.out.println("Correct!");
		if ((input != 'W') && (input != 'w'))
			System.out.println("Nope, not correct!");
	}

}
