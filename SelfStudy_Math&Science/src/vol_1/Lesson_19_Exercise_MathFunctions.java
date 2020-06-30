package vol_1;

public class Lesson_19_Exercise_MathFunctions {

	public static void main(String[] args) {

		/*
		 * .Math class functions pow (x, y) take number x and raise it to the power of
		 * y. 1.25 to the power of 20 show the result from 1-20.
		 */

		int exponent;
		double answer;

		for (exponent = 1; exponent <= 20; exponent++) {
			answer = Math.pow(1.25, exponent);
			System.out.println("1.25 raise to the power of " + exponent + " is equal to " + answer + ".");
		}
	}

}
