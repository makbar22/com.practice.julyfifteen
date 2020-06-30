package date05182020;

public class Array_Exercise_MinMaxSum_UsingString {

	public static void main(String[] args) {
		String[][] studentScore = new String[5][5];

		studentScore[0][0] = "John";
		studentScore[0][1] = "70";
		studentScore[0][2] = "78";
		studentScore[0][3] = "85";
		studentScore[0][4] = "90";

		studentScore[1][0] = "Jack";
		studentScore[1][1] = "67";
		studentScore[1][2] = "70";
		studentScore[1][3] = "65";
		studentScore[1][4] = "83";

		studentScore[2][0] = "Steven";
		studentScore[2][1] = "57";
		studentScore[2][2] = "60";
		studentScore[2][3] = "77";
		studentScore[2][4] = "70";

		studentScore[3][0] = "Bob";
		studentScore[3][1] = "80";
		studentScore[3][2] = "98";
		studentScore[3][3] = "88";
		studentScore[3][4] = "84";

		studentScore[4][0] = "Sam";
		studentScore[4][1] = "77";
		studentScore[4][2] = "79";
		studentScore[4][3] = "65";
		studentScore[4][4] = "97";

		int totalOfScore = 0;
		int max = Integer.parseInt(studentScore[1][1]);
		int min = Integer.parseInt(studentScore[1][1]);
		int count = 0;
		double average = 0;

		for (int x = 0; x < studentScore.length; x++) {

			for (int y = 0; y < studentScore.length; y++) {
				System.out.print(studentScore[x][y] + " ");

				System.out.println();
				if (y != 0) {
					totalOfScore += Integer.parseInt(studentScore[x][y]);
					count = studentScore[x].length - 1;
					average = (double) totalOfScore / count;
					if (max < Integer.parseInt(studentScore[x][y])) {
						max = Integer.parseInt(studentScore[x][y]);
					}
					if (min > Integer.parseInt(studentScore[x][y])) {
						min = Integer.parseInt(studentScore[x][y]);
					}

				}
			}
			System.out.println("Total studentScore: " + totalOfScore);
			totalOfScore = 0;
			System.out.println("Max studentScore: " + max);
			System.out.println("Min studentScore: " + min);
			System.out.println("Average studentScore: " + average);
			System.out.println("Count subjects: " + count);
			System.out.println();

		}
	}

}
