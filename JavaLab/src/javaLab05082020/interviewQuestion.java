package javaLab05082020;

public class interviewQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Create below Patterns: A:
		 *
		 **
		 ***
		 ****
		 *****
		 * B:
		 *****
		 ****
		 ***
		 **
		 *
		 * C:
		 *
		 **
		 ***
		 ****
		 *****
		 ****
		 ***
		 **
		 *
		 * 2. Reverse Following String in Console: "Test Automation Engineer" 3. Specify
		 * the greatest Number: int x = 600; int y = 700; int z= 300; 4. Reverse
		 * following number: 1234
		 * 
		 */

		System.out.println("A:");
		for (int a = 1; a < 6; a++) {
			for (int b = 0; b < a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\nB:");
		for (int c = 6; c > 1; c--) {
			for (int d = 1; d < c; d++) {
				System.out.print("*");
			}
			System.out.println("");

		}
		System.out.println("\nC:");
		for (int e = 1; e < 5; e++) {
			for (int f = 0; f < e; f++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int g = 6; g > 1; g--) {
			for (int h = 1; h < g; h++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("\n2:");

		String i = "Test Automation Engineer"; // String is immutable meaning we can replace the character, we can make
												// it mutable by using .charAt
		for (int j = 0; j < i.length(); j++) {
			System.out.print(i.charAt(j) + " ");
		}
		System.out.println();

		for (int k = i.length() - 1; k >= 0; k--) { // -1 so it starts from index zero not index 1
			System.out.print(i.charAt(k) + " ");
		}
		System.out.println();

		System.out.println("\n3:");
		int l = 600;
		int m = 700;
		int n = 300;

		if (l > m && l > n) {
			System.out.println(m + " is the greatest");
		} else if (m > l && m > n) {
			System.out.println(m + " is the greatest");
		} else
			System.out.println(n + " is the greatest");

		System.out.println("\n4:");

		int num = 1234;
		int rev = 0;

		while (num != 0) {
			int p = num % 10;
			rev = rev * 10 + p;
			num = num / 10;
		}
		System.out.println("Reversed number is:  " + rev);
	}
}
