package InterveiwQuestion06152020;

public class EvenAndOdd {

	public static void main(String[] args) {

		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

//	Modules is the first way. meaning anything divided by 2 and if the remainder (%) is zero then it's even

		for (int i : data) {
			if (i % 2 == 0) {
				System.out.println(i + " is Even\t");

			} else {
				System.out.println(i + " is Odd\t");
			}
		}
	}
}
