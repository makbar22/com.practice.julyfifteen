package date05122020;

public class FinalModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int x = 10; //won't work if final because 10 cannot change
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x++);
	}

}
