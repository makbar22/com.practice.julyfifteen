package murRoh;

public class Practice05012020 {

	public static void main(String[] args) {
		String a = "AFGHANISTAN";
		for (int x = a.length() - 1; x >= 0; x--) {
			System.out.print(a.charAt(x) + "\t");
		}
		System.out.println();

		for (int y = 0; y < a.length(); y++) {
			System.out.print(a.charAt(y) + "\t");
		}
		System.out.println("\n\n" + a.charAt(5));
		//Please record the class!
	}

}
