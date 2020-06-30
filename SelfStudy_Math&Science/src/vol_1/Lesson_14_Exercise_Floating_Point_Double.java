package vol_1;

public class Lesson_14_Exercise_Floating_Point_Double {

	public static void main(String[] args) {

		// Exercise 1: Write a program to convert 34.0 degree Celcius to Farenheit
		// Equation for conversion: farenheit = (9 / 5) * celcius + 32

		System.out.println("-----------------------------------Exercise One-----------------------------------");

		double cel; // initialization
		double far;

		cel = 34.0; // assignment
		far = (9.0 / 5.0) * cel + 32;

		System.out.println(cel + " degree celcius is equal to " + far + " degree farenheit.\n");

		// Exercise 2: Write a program to convert 10.5 feet to meters. There are 0.305
		// meters per
		// foot.

		System.out.println("-----------------------------------Exercise Two-----------------------------------");

		double met, ft;

		ft = 10.5;
		met = 0.305;

		System.out.println(ft + " feet are equal to " + ft * met + " meters.\n");
	}
}
