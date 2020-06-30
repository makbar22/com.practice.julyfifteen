package vol_1;

public class Lesson_17_Exercise_ForLoop_IF_BlockOfCodes {

	public static void main(String[] arg) {

		System.out.println("-----------------------------------Exercise One-----------------------------------");

		int age;// declaring variable

		age = 25; // assigning value

		if (age >= 30) {
			System.out.println("Oh no, I am older than 30 years old!");
			System.out.println("I may be a little older,");
			System.out.println("but I am definitely a little wiser!");
		}
		if (age < 30) {
			System.out.println("Roses are Red,");
			System.out.println("And Violets are Blue.");
			System.out.println("I'm less than 30,");
			System.out.println("And I like kung-fu!");

		}
		System.out.println();

		System.out.println("-----------------------------------Exercise Two/Three-----------------------------------");

		int inch; // declaration
		double feet;
		int counter;

		inch = 1;
		counter = 0; // to have a blank line after 4 out puts

		for (inch = 1; inch <= 20; inch++) {
			feet = inch / 12.0; // 12.0 not 12 because we want the division to be converted into floating-point
								// numbers with decimal (double)
			if (inch == 1) // in order to print inch not inches
				System.out.println(inch + " inch is equal to " + feet + " feet.");
			if (inch != 1)
				System.out.println(inch + " inches is equal to " + feet + " feet.");
			counter++;
			if (counter == 4) {
				System.out.println(); // printing a blank line
				counter = 0; // reset the counter back to 0 so it prints after 4 again
			}
		}

	}
}
