package date05182020;

public class Array_Exercise_MinMaxSumCountAverage {

	public static void main(String[] arg) {

		int[][] array = new int[2][4];

		array[0][0] = -2;
		array[0][1] = 2;
		array[0][2] = 12;
		array[0][3] = -5;

		array[1][0] = 22;
		array[1][1] = 42;
		array[1][2] = 9;
		array[1][3] = -5;

		// Find the value array
		// Find Minimum and Maximum
		// Find Sum

		int max = array[0][0];
		int min = array[0][0];
		int sum = 0;
		int count = 0;
		float avg = 0f;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count = array[i].length; // when entered in first array, we will see all the indexes within
				avg = (float) sum / count; // cast to get accurate value
				if (array[i][j] > max) {
					max = array[i][j];

					if (array[i][j] < min) {
						min = array[i][j];
					}
				}

				System.out.print(array[i][j] + "\t\t");
			}
			System.out.println();
			System.out.println("\nSum Value: " + sum);
			sum = 0; // we have to reassign value to zero otherwise it'll increment to previous row's
						// value.
			System.out.println("Average Value: " + avg);
			System.out.println("Max Value: " + max);
			System.out.println("Min Value: " + min + "\n");

			// System.out.println();
		}

	}
}
