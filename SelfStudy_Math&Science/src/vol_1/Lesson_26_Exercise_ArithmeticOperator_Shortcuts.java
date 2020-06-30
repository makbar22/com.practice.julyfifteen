package vol_1;

public class Lesson_26_Exercise_ArithmeticOperator_Shortcuts {

	public static void main(String[] args) {

		int num = 1;

		System.out.println("num\tnum+2\tnum-2\tnum*2\tnum/2");

		for (num = 1; num <= 15; num++) {
			int a = num, b = num, c = num;
			double d = num;
			a += 2;
			b -= 2;
			c *= 2;
			d /= 2;
			System.out.println(num + "\t" + a + "\t" + b + "\t" + c + "\t" + d);

		}
	}

}
