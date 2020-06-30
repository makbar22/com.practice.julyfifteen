package vol_1;

public class Integer_Arithmetic_Operators {

	public static void main(String[] args) {

		int num1, num2, num3, num4;

		num1 = 10;
		num2 = 5;

		int sum, difference;
		int multiply, divide;

		sum = num1 + num2;
		difference = num1 - num2;
		multiply = num1 * num2;
		divide = num1 / num2;

		System.out.println("The sum of num1 and num2 is: " + sum);
		System.out.println();
		System.out.println("The difference of num1 and num2 is: " + difference);
		System.out.println();
		System.out.println("The multiplication of num1 and num2 is: " + multiply);
		System.out.println();
		System.out.println("The division of num1 and num2 is: " + divide);

		// Overriding values of variables
		System.out.println("\n\n");

		num1 = num1 * 2; // overrode the original value of num1
		System.out.println("New value of num1 is: " + num1);
	}

}
