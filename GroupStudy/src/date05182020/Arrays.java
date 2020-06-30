package date05182020;

public class Arrays {

	public static void main(String[] args) {

		System.out
				.println("-----------------------------------------Single D-----------------------------------------");
		int[] a = { 34, 56, 45 };// direct declaration and initialization
		for (int j : a) { // we have to use the data type of array not loop
			System.out.println(j);
		}

		int b[] = new int[3]; // declaration and initialization
		b[0] = 10; // assignment of value
		b[1] = 15;
		b[2] = 20;

		System.out.println(b[0] + "\n" + b[1] + "\n" + b[2]); // not efficient way to print it

		for (int i = 0; i < b.length; i++) { // Efficient way to print it
			System.out.println(b[i]);
		}

		System.out
				.println("-----------------------------------------Double D-----------------------------------------");

		int[][] x = { { 1, 2, 3 }, { 4, 5, 6 } }; // direct

		for (int[] k : x) { // using for each loop
			for (int l : k) {
				System.out.print(l + " ");
			}
			System.out.println();
		}

		int[][] y = new int[2][2]; // indirect
		y[0][0] = 1;
		y[0][1] = 2;
		y[1][0] = 3;
		y[1][1] = 4;

		for (int f = 0; f < y.length; f++) { // using for loop
			for (int e = 0; e < y[f].length; e++) {
				System.out.print(y[f][e] + " ");
			}
			System.out.println();
		}

	}

}
