package vol_1;

public class Lesson_20_Exercise_Character_DataType {

	public static void main(String[] args) {

		// write a program that uses a for loop to point out the alphabet from A - Z as
		// follows

		char character1, character2;

		character1 = 'A';
		character2 = 'a';

		for (int i = 1; i <= 26; i++) {
			System.out.println(character1 + "\t" + character2);
			character1++;
			character2++;
			
			
		}

	}
}