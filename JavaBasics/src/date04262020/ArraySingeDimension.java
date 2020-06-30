package date04262020;

public class ArraySingeDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declare and initialize
		int numbers[] = new int[5];

		// assignment
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;

// more time consuming:
//		System.out.println(numbers [0]);
//		System.out.println(numbers [1]);
//		System.out.println(numbers [2]);
//		System.out.println(numbers [3]);
//		System.out.println(numbers [4]);

		// to make it easier to print we can add a variable and increment it..
		int indexNumber = 0;
//		System.out.println(numbers[indexNumber++]);
//		System.out.println(numbers[indexNumber++]);
//		System.out.println(numbers[indexNumber++]);
//		System.out.println(numbers[indexNumber++]);
//		System.out.println(numbers[indexNumber++]);

		// to make it even more efficient, we can use for loop
		System.out.println("Printing array using loop ----------------------");
//		for (int i = 0; i < 5; i++) {
//			System.out.println(numbers[i]);
		// or
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);

			// printing the size of the array array.net
//			System.out.println("Size of the array using the length " + numbers);

		}
		System.out.println("----------------creating an array of objects----------------");
		System.out.println("elements of array names");

		String[] names = { "Jack", "Kim", "Ash", "Mash", "Pash", "Dash" };
		for (int i = 0; i < names.length; i++) {
			System.out.println((i + 1) + " ." + names[i]);
		}
	}
}
