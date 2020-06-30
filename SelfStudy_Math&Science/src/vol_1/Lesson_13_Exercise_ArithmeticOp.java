package vol_1;

public class Lesson_13_Exercise_ArithmeticOp {

	public static void main(String[] args) {

		// Exercise 1: dimensions of back yard is 20, 18, 17, 24 feet. Find the
		// perimeter

		System.out.println("-----------------------------------Exercise One-----------------------------------");

		int side1; // declaring variables
		int side2;
		int side3;
		int side4;

		side1 = 20; // assigning values to variables
		side2 = 18;
		side3 = 17;
		side4 = 24;

		int sum; // declaring the sum of all (perimeter)

		sum = side1 + side2 + side3 + side4; // assigning value to sum integer

		System.out.println("The perimeter of the yard is " + sum + " feet.\n"); // outputting the result

		// Exercise 2: rectangular wall has dimensions of 23 ft x 12 ft, write a program
		// to calculate
		// the area of the wall and display the result
		System.out.println("-----------------------------------Exercise Two-----------------------------------");

		int length; // declaring the length and width of rectangular
		int width;

		length = 23; // assigning values to rectangular
		width = 12;

		int area; // declaring area variable ==> width x length square feet

		area = length * width; // assigning value to area

		System.out.println("The are of the wall is " + area + " square feet.\n"); // outputting the results

		// Exercise 3: a sail boat sail is triangular and has height of 14 ft. The
		// length of the base
		// of the flag is 6 ft. The formula for the area of the triangle is:
		// area = base*height/2
		System.out.println("-----------------------------------Exercise Three-----------------------------------");

		int height; // declaration
		int newLength;

		height = 14; // initialization/assignment
		newLength = 6;

		int newArea; // delclaration

		newArea = height * newLength / 2;

		System.out.println("The area of the sail is " + newArea + " square feet.");

	}

}
