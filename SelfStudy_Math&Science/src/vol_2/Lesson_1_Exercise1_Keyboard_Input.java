package vol_2;

public class Lesson_1_Exercise1_Keyboard_Input {

	public static void main(String[] args)

			throws java.io.IOException {

		char answer;

		System.out.println("The capital of the US is Washington, DC? (Answer T or F): ");

		answer = (char) System.in.read();

		if (answer == 'T')
			System.out.println("Correct!");

		if (answer == 'F')
			System.out.println("Incorrect!");

	}
}
