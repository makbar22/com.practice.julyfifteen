package date04262020;

public class ArrayPractice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// create single dimension array of int have the value 10, 15, 18, 25, 89
// run a loop and print all
// if you like challenge, try to get the average of the number in the array
		int number[] = new int[5];
		number[0] = 10;
		number[1] = 15;
		number[2] = 18;
		number[3] = 25;
		number[4] = 89;

		double sum = 0;
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
			sum = sum + number[i]; // sum which is 0 + 10 and the 10+15, ....
		}// if we don't close here, the following is going to run after every loop
		double avg = sum / number.length; // number.length is the size of index (5)
		System.out.println("Average: " + avg);
		System.out.println("Sum of all number:" + sum);

		// average: int average = (10 + 15...) / 5; sysout (average)

	}

}
