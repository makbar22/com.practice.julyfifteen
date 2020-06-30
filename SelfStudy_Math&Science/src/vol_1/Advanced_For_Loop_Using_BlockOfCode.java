package vol_1;

public class Advanced_For_Loop_Using_BlockOfCode {

	public static void main(String[] args) {
		// For Loop using code of block (curly braces)
		int i, square;

		for (i = 1; i <= 10; i++) {
			square = i * i;
			System.out.println("i is equal to: " + i + ", and square of i is equal to: " + square + ".");
		}

		// If Statement using code of block (curly braces)
		System.out.println();
		int a;

		a = 10;

		if (a == 5) {
			a = a + 5;
			System.out.println("a was 5, but now a is " + a + ".");
		}
		if (a == 10) {
			a = a + 2;
			System.out.println("a was 10, but now a is " + a + ".");
		}
	}

}
