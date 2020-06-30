package vol_1;

public class Lesson_15_Exercise_IfStatement_SingleLine {

	public static void main(String[] args) {

		// Exercise 1: Jenny is 14 yo, Danny is 6, Clair is 6
		// Write a program that uses the IF statements to output the following text:

		System.out.println("-----------------------------------Exercise One-----------------------------------");

		int jenny, danny, clair; // declaration

		jenny = 14; // initialization
		danny = 6;
		clair = 6;

		if (jenny > danny)
			System.out.println("Jenney is older than Danny.\n");

		if (danny > jenny)
			System.out.println("Danny is older than Jenny.\n");

		if (danny == jenny)
			System.out.println("Danny is the same age as Jenny.\n");

		if (danny == clair)
			System.out.println("Danny is the same age as Clair.\n");

		// Exercise 2: Car 1 has mileage 86000. Car 2 101000.
		// Write a program that uses IF statements to evaluate and output the following:

		System.out.println("-----------------------------------Exercise Two-----------------------------------");

		int car1, car2;

		car1 = 86000;
		car2 = 101000;

		if (car1 <= car2)
			System.out.println("Car 1 mileage is less than or equal to Car 2.\n");

		if (car2 == 101000)
			System.out.println("Car 2 has a mileage of 101000.\n");

		if (car2 < car1)
			System.out.println("I will eat my foot if this prints on the screen");
	}
}
