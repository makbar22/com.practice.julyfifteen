package date05192020;

public class Throw {

	public static void main(String[] args) {

		int x = 10;
		int[] y = { 2, 3, 0, 10 };

		try {
			System.out.println(x / y[10]);

		} catch (ArithmeticException i) {
			System.out.println("You are trying to divide by zero. Please try again!");
		} catch (ArrayIndexOutOfBoundsException j) {

			System.out.println("Use a valid index number!");
		} catch (Exception e) {
			throw e; // it will throw the exception (tell us what exception it's)
			// System.out.println("Exception! " + e);
		}

	}

}
