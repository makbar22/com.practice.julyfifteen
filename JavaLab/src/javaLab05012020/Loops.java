package javaLab05012020;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while loop
		int x = 1;
		while (x < 5) {
			System.out.println("Value of x:" + x);
			x++;
		}

		// for loop
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}

		// enhance/for each loop
		int[] myArray = { 1, 2, 3, 4, 5 };
		for (int y : myArray) {
			System.out.println(y);
		}
		// do while
		int v =21;
		do {
			System.out.println("value of v:" + v);
		} while (v < 20);
	}
}
