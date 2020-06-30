package exception;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // will scan what's in the console

		System.out.println("Enter Your Age Please: ");

		int age = s.nextInt();

		if (age < 18) {
			throw new YoungerAgeException("You are not eligible go home!");

		} else {
			System.out.println("You voted!");
		}

	}
}