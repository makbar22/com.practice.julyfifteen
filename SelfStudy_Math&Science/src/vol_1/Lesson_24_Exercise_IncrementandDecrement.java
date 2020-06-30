package vol_1;

public class Lesson_24_Exercise_IncrementandDecrement {

	public static void main(String[] args) {

		int i, value;
		int factor = 2;

		for (i = 140; i >= 130; i--) {
			value = i * factor;
			System.out.println(i + " times " + factor + " equals " + value);
		}
	}
}
