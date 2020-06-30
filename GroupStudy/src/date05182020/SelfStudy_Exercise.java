package date05182020;

public class SelfStudy_Exercise {

	public static void main(String[] args) {

		int[][] numbers = new int[3][5];

		numbers[0][0] = -1;
		numbers[0][1] = -2;
		numbers[0][2] = -3;
		numbers[0][3] = 4;
		numbers[0][4] = 5;

		numbers[1][0] = 2;
		numbers[1][1] = -3;
		numbers[1][2] = 9;
		numbers[1][3] = 3;
		numbers[1][4] = 4;

		numbers[2][0] = -2;
		numbers[2][1] = 9;
		numbers[2][2] = 3;
		numbers[2][3] = -8;
		numbers[2][4] = 2;

		int sum = 0;
		int count = 0;
		float avg = 0f;
		int max = numbers[0][0]; // if we choose 0, it'll only work in case of positive number not negative.
		int min = numbers[0][0]; // numbers before the index to know index of which identifier

		int outer;
		int inner;

		for (outer = 0; outer < numbers.length; outer++) {
			for (inner = 0; inner < numbers[outer].length; inner++) {

				sum += numbers[outer][inner];

				count = numbers[outer].length;

				avg = (float) sum / count;	// casting it to float to force it into floating point

				if (numbers[outer][inner] > max) {
					max = numbers[outer][inner];
				}

				if (numbers[outer][inner] < min) {
					min = numbers[outer][inner];
				}
				System.out.print(numbers[outer][inner] + "\t");

			}
			System.out.println("\n------------------------------------------------");
			System.out.println("\nSum of the above numbers is equal to: " + sum);
			sum = 0;
			System.out.println("Count of the above numbers is equal to: " + count);
			System.out.println("Average of the above numbers is equal to: " + avg);
			System.out.println("Maximum of the above numbers is equal to: " + max);
			System.out.println("Minimum of the above numbers is equal to: " + min + "\n\n");
		}

	}
}
