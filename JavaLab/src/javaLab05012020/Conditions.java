package javaLab05012020;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Six type of relational operators: A<B A<=B A>B A>=B A==B A!=B
		 */
		// IF/ELSE CONDITION
		// if (20>18){
		if (20 == 18) {
			System.out.println("20 is greater than 18");
		} else {
			System.out.println("20 is not equal to 18");
		}

		// ELSE IF CONDTION
		int time = 18;
		if (time == 20) {
			System.out.println("Good Evening");
		} else if (time > 20) {
			System.out.println("Good Night");
		} else {
			System.out.println("I'm confused");
		}
	
		// SWITCH CONDITION
		int day = 1;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wedensday");
			break;
			default:
			System.out.println("Have a good weekend");
		}
	
	}
	
}
