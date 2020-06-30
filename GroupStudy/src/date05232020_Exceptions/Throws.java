package date05232020_Exceptions;

public class Throws {

	public static void main(String[] args) throws Exception {
		try { // any one who's handling main method will use try and catch to figure it out
			Throws obj = new Throws();
			obj.sum();
		} catch (ArithmeticException e) {
			e.printStackTrace(); // prints the trace of throws i.e. div, sum, main.
		}
		
		System.out.println("After Exception is Thrown");
	}

	public static void sum() throws Exception { // sum throws it to main method
		div();
	}

	public static void div() throws Exception { // origin of exception - throws it to sum
		int a = 10 / 0;
		System.out.println(a);
	}
	
}