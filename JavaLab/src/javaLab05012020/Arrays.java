package javaLab05012020;

public class Arrays {
	public static void main(String[] args) {
		// ONE DIMENSION

		String[] myArray = new String[4];

		myArray[0] = "Ahmad"; // one way of assigning values

		String[] myArray2 = { "Ahmad", "John", "Mike", "Covid19" }; // other way to initialize and assigning value
		System.out.println(myArray[0]); // << To iterate
		System.out.println(myArray[1]);

		// TWO DIMENSION
		int[][] myArray3 = new int[2][2];
		myArray3[0][0] = 1; // one way to assign value
		myArray3[0][1] = 2;
		myArray3[1][0] = 3;
		myArray3[1][1] = 4;
		int[][] myArray4 = { { 1, 2, 3 }, { 4, 5, 6 } }; // another way to initialize and assign

		for (int i = 0; i < myArray3.length; i++) { // to iterate for rows
			for (int j = 0; j < myArray3[i].length; j++) { // to iterate and go through the columns

				System.out.print(myArray3[i][j]);

			}
			System.out.println();
		}
	}
}