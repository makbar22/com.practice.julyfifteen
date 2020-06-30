package date04232020;

public class LoopingForAdvance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// we have a rang of numbers x - y,
		// print all even number first, and then all of the odd numbers in the range
		// even number in the ragne are: 0, 2,...
		// odd number in the range are: 1, 3,....
		int x = 0;
		int y = 10;
		String even = "Even number in the range are:";
		String odd = "Odd number in the range are:";

		for (int i = x; i < y; i++) {
			if (i % 2 == 0) {
				even += i + ", ";
				System.out.println(even);
			} else {
				odd += i + ", ";
				System.out.println(odd);
			}
		}
	}
}
