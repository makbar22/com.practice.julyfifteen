package date05192020;

public class Try_Catch {

	public static void main(String[] args) {

		int x = 10;
		int y = 0;
//
//		System.out.println(x / y);	// unchecked exception
//		System.out.println("End");

		int[] data = { 1, 2, 3 };
		try {
			System.out.println(data[5]); // unchecked exception
			System.out.println("End");
		} catch (ArrayIndexOutOfBoundsException e) { // e is the object of exception
			System.out.println("The index number doesn't exist " + e);

		} catch (Exception i) { //// if we have this after at the beginning, then the rest of exception are not
								//// going to execute and will give an error because <Exception> is the parent
								//// of all exception and it will redundant (the first exception will never be
								//// reached)
			System.out.println("Second catch");

		} finally {
			System.out.println("finally block");
		}
		
		System.out.println( x/ y);
		System.out.println("The End");
	}
}
