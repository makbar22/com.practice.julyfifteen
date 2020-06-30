package vol_1;

public class Logical_Operators {

	public static void main(String[] args) {

		/*
		 * Logical And "A and B" Logical Or "A or B" Logical Not "Inverted State"
		 * Logical Xor "A or B but not both"
		 */

		int a;
		boolean b;

		a = 15;
		b = true;

		if ((a == 10) ^ (b = true))
			System.out.println("Success!");

	}
}
