package assignment;

public class Homework_W1_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * For this portion of the assignment you will be declaring a series of
		 * variables following an exact set of instructions indicating what data type
		 * and identifier should be used for each variable.
		 * 
		 * Note: You only need to declare these variables. It is not necessary
		 * initialize them or otherwise assign a value to them. Note: The variables must
		 * be declared in the same order as the instructions.
		 *
		 * 1) Declare a variable of type int with the identifier
		 * sizeOfComicBookCollection 2) Declare a variable of type String with the
		 * identifier mostPopularMovieStar 3) Declare a variable of type double with the
		 * identifier usDollarBritishPoundConversionRate 4) Declare a variable of type
		 * short with the identifier shoppingDaysUntilHalloween 5) Declare a variable of
		 * type long with the identifier starsInTheMilkyWay
		 */

		// Put your code here:

		/**
		 * For this portion of the assignment you will be working with String
		 * concatenation.
		 * 
		 * Variables have already been declared and initialized below that will be used
		 * as part of your solution.
		 * 
		 * Note: For all of the steps below, make sure to declare the variable and
		 * assign its value all as a single line of code.
		 * 
		 * 1) Declare a String variable with the identifier sentence1 and assign it any
		 * value you choose such that is a sentence.
		 * 
		 * 2) Declare a String variable with the identifier sentence2 and assign it any
		 * value that you would like such that it is some other sentence.
		 * 
		 * 3) Declare an int variable with the identifier points and assign it any valid
		 * value of your choosing.
		 * 
		 * 4) Declare a String variable with the identifier noSpace and assign it the
		 * value of concatenating sentence2 on to the end of sentence1.
		 * 
		 * 5) Declare a String variable with the identifier withSpace and assign it the
		 * value of concatenating sentence2 on to the end of sentence1, but make sure to
		 * also concatenate an string literal with a space in it between the sentence1
		 * and sentence2
		 * 
		 * 6) Declare a String variable with the identifier message1 and assign it the
		 * value as follows:
		 * 
		 * I hope I score at least $points points on this assignment.
		 * 
		 * Note: $points should be the actual value of the variable points as a result
		 * of concatenating the variable points with two String literals to make a
		 * complete sentence. It should not be the literal value "$points" Note:
		 * Capitalization, punctuation, and spacing are important.
		 * 
		 * 7) Declare a String variable with the identifier message2 and assign it the
		 * value as follows:
		 * 
		 * $firstName $lastName was an actor who starred in $numberOfFilms movies.
		 * 
		 * Note: $firstName, $lastName, and $numberOfFilms should be the actual value of
		 * the associated variables as a result of using them in string concatenation to
		 * make a sentence. They should not be the literal values "$firstName",
		 * "$lastName", or "$numberOfFilms". It should not be the literal value
		 * "$points" Note: Capitalization, punctuation, and spacing are important.
		 */

		// Previously declared variables. Do Not Remove or Modify
		String firstName = "Raul";
		String lastName = "Julia";
		int numberOfFilms = 32;

		// Your code goes here

		// Print the $message1 and $message2 and run the code

// SECTION ONE	
		int sizeOfComicBookCollection;
		String mostPopularMovieStar;
		double usDollarBritishPoundConversionRate;
		short shoppingDaysUntilHalloween;
		long starsInTheMilkyWay;

//SECTION TWO
		String sentence1 = "TEK school's";
		String sentence2 = "current student.";
		int points = 30;
		String noSpace = sentence1 + sentence2;
		String withSpace = sentence1 + " " + sentence2;
		String message1 = "I hope I score at least " + points + " points on this assignment.";
		String message2 = firstName + " " + lastName + " was an actor who starred in " + numberOfFilms + " movies.";

// PRINT OF SECTION TWO
		System.out.println(sentence1);
		System.out.println(sentence2);
		System.out.println(noSpace);
		System.out.println(withSpace);
		System.out.println(message1);
		System.out.println(message2);
	}

}
