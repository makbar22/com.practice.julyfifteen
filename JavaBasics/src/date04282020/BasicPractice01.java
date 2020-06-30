package date04282020;

public class BasicPractice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] data = new String[5][2];
//
//		data[0][0] = "Sam";
//		data[0][1] = "123";
//
//		data[1][0] = "Bam";
//		data[1][1] = "321";
//
//		data[2][0] = "Mam";
//		data[2][1] = "231";
//
//		data[3][0] = "Dam";
//		data[3][1] = "312";
//
//		data[4][0] = "Wam";
//		data[4][1] = "213";
//
//		for (int row = 0; row < data.length; row++) {
//			for (int col = 0; col < data[row].length; col++) {
//				System.out.print(data[row][col] + " ");
//			}
//			System.out.println();
//		}
//
		int numberAreFun[][] = new int[10][20];
		int num = 1;

		for (int i = 0; i < numberAreFun.length; i++) {
			for (int j = 0; j < numberAreFun[i].length; j++) {
				numberAreFun[i][j] = num++;
			}
		}
		for (int i = 0; i < numberAreFun.length; i++) {
			for (int j = 0; j < numberAreFun[i].length; j++) {

				System.out.print(numberAreFun[i][j] + " ");
			}
			System.out.println();
		}
	}
}