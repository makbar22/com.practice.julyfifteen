package vol_1;

public class Lesson_16_Exercise_ForLoops {

	public static void main(String[] args) {

		// Exercise 1: write a program that uses a for loop to output the following
		// countdown:

		System.out.println("-----------------------------------Exercise One-----------------------------------");

		int countdown;

		for (countdown = 10; countdown > 0; countdown--)
			System.out.println(countdown + "\n");

		System.out.println("Blastoff!\n");

		// Exercise 2: write a program to count by 2's from 0 to 16 as show below.
		// Format output as:

		System.out.println("-----------------------------------Exercise Two-----------------------------------");

		int num;

		for (num = 0; num <= 16; num += 2)
			System.out.println("The current number is: " + num);
	}
}
