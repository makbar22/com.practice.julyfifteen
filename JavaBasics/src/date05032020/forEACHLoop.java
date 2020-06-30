package date05032020;

public class forEACHLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// For Loop
		int[] numbers = { -1, -2, -3, -4, 5 };
		int max = numbers[0]; // we assign the value of index zero because if we assign zero and the numbers
								// are negative, it will not work
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) { // using For loop

			if (numbers[i] > max) {
				max = numbers[i];
			} else if (numbers[i] < min) {
				min = numbers[i];

			}

		}
		System.out.println(max);
		System.out.println(min);

		System.out.println("\nFOR EACH LOOP");

		// For Each Loop
		for (int i : numbers) {
			System.out.println(i);
		}
		System.out.println("\nPRACTICE");// video 5/03 @ 4:25 - 5:00PM
		// find max and min and the average
		// use for and for each loop
		int[][] nums = { { 12, 12, 23, 5 }, { 1, 12, 34, 2 } };
		int maxNew = nums[0][0];
		int minNew = nums[0][0];

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");

				if (nums[i][j] > maxNew) {
					maxNew = nums[i][j];
				} else if (nums[i][j] < minNew) {
					minNew = nums[i][j];
				}
			}
			System.out.println();
			System.out.println(maxNew);
			System.out.println(minNew);

		}

		int[][] num = { { 12, 12, 23, 5 }, { 1, 12, 34, 2 } };
		int max1 = num[0][0];
		int min1 = num[0][0];
		int sum = 0;
		int count = 0;
		double average;
		for (int[] outer : num) {
			for (int value : outer) {
				System.out.print(value + "\t");
				if (value > max1) {
					max1 = value;
				} else if (value < min1) {
					{
						min1 = value;
					}
				}
				sum += value;
			}
			count += outer.length;
			System.out.println();
		}
		average = (double) sum / count;
		System.out.println("\nFunctions:");
		System.out.println("Min: " + min1);
		System.out.println("Max: " + max1);
		System.out.println("Sum: " + sum);
		System.out.println("Count: " + count);
		System.out.println("Average: " + average);
	}
}
