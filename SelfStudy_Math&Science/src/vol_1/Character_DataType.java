package vol_1;

public class Character_DataType {

	public static void main(String[] args) {

		char character = 'a';
		System.out.println(character);

		character++;
		System.out.println(character);

		character = 85;
		System.out.println(character);

		// let's print all the character using uni code

		for (int i = 0; i <= 200; i++) {
			character = (char) i;	// we are forcing the integer to character by casting (char)
			System.out.println("Unicode " + i + " corresponds to character " + character);
		}

	}
}
