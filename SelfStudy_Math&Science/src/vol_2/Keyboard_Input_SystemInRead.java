package vol_2;

public class Keyboard_Input_SystemInRead {

	public static void main(String[] args)

			throws java.io.IOException {

		char input;

		System.out.println("Enter a single character from the keyboard, then press ENTER: ");

		input = (char) System.in.read();

		System.out.println("The character you type was: " + input);

	}

}