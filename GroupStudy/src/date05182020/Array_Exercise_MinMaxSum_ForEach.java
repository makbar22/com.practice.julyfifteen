package date05182020;

public class Array_Exercise_MinMaxSum_ForEach {
	public static void main(String[] args) {

		int[][] array = { { 20, 25, 30, 35 }, { 40, 45, 50 } };
		int total = 0;
		int count = 0;
		double average = 0;
		int max = array[0][0];
		int min = array[0][0];

		for (int[] i : array) {
			for (int j : i) {
				System.out.print(j + "\t");
				if (j > max) {
					max = j;
				} else if (j < min) {
					min = j;
				}
				total += j;
				count = i.length;
				average = (double) total / count;
			}
			System.out.println();
			System.out.println("Count of the indexes: " + count);
			System.out.println("Max of the values: " + max);
			System.out.println("Min of the values: " + min);
			System.out.println("Total of the values: " + total);
			System.out.println("Total of the values: " + total);
			System.out.println("Average of the indexes: " + average);
			total = 0;
			System.out.println();
		}
	}
}
