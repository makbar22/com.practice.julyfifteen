package vol_1;

public class Simple_For_Loop {

	public static void main(String[] args) {

		int counter;

		for (counter = 0; counter <= 10; counter = counter + 1) // increment counter = counter + 1
			System.out.println("The counter is at: " + counter);

		System.out.println();

		for (counter = 5; counter <= 10; counter += 5)
			System.out.println("The counter is at: " + counter);

		System.out.println();

		for (counter = 100; counter >= 0; counter -= 10)
			System.out.println("The counter decreases by 10 and counter is at: " + counter);

	}

}
