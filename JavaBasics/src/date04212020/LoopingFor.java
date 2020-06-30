package date04212020;

public class LoopingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * print 1-30 and any of the number divisible by 3 print Tek, else print i
		 */
//		for (int i = 1; i <= 30; i++) {
//			if (i % 3 == 0) {
//				System.out.println("Tek");
//			} else {
//				System.out.println(i);
//			}
//		}

		for (int i = 1; i <= 30; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				System.out.println("TEKSCHOOL");
			else if (i % 3 == 0)

				System.out.println("TEK");
			else if (i % 5 == 0)
				System.out.println("SCHOOL");

			else

				System.out.println(i);
		}
	}
}
