package operators_date_07052020;

public class Challenge {
	public static void main(String[] args) {

		/*
		 * 1.create a double variable with a value of 20.00 2.create a second double
		 * variable with a value of 80.00 3.add both numbers together and multiply it by
		 * 100.00 4.use the remainder operator to figure out what the remainder from the
		 * result of the operation in step 3 and 40.00. 5.create a boolean variable that
		 * assigns the value true if the remainder in #4 is 0, or false if it's not
		 * zero. 6.output the boolean variable 7.write an if-then statement that
		 * displays a message "Got some remainder" if the boolean in step 5 is not true
		 * 
		 */
		double a = 20.00;
		double b = 80.00;
		double newVal = (a + b) * 100D;// if you don't use parentheses then it will return false because of operator precedence

		double remainder = newVal % 40.00D;

		boolean isThereRemainder = (remainder == 0) ? true : false; // ternary operator
		System.out.println(isThereRemainder);

		if (!isThereRemainder) {
			System.out.println("Got some remainder");

		}
	}
}
