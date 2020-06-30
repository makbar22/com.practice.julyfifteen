package date05192020;

public class Throws {

	public static void main(String[] args) {

		try {
			printDivide(10, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void printDivide(int x, int y) throws Exception {// always written after the arugment
		System.out.println(x / y);
	}

}
