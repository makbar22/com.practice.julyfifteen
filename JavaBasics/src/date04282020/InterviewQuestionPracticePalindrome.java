package date04282020;

public class InterviewQuestionPracticePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "tacocat";
		// System.out.println(x.charAt(0)); // char at will return the character at that
		// index
		// System.out.println(x.length()); // method length will return the size of the
		// sting
		System.out.println("--------------Actual Loop Forward---------------");
		for (int i = 0; i < x.length(); i++) {
			System.out.print(x.charAt(i) + "\t");
		}
		System.out.println("\n--------------Actual Loop BAckward-------------");
		for (int i = x.length() - 1; i >= 0; i--) {
			System.out.print(x.charAt(i) + "\t");
		}

//		System.out.println("\n--------------Is it Pal------------");
//		int temp = x.length() - 1;
//		boolean pal = true;
//		for (int i = 0; i < x.length(); i++) {
//			System.out.print(x.charAt(i) +"  ");

//		}
	}
}
