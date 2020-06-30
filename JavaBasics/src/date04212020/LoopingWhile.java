package date04212020;

public class LoopingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// let's say I want to run the number until the number is less than 7 >> we use while loop
// it's good to use while when we have a open condition
		int number = 1;
		while (number < 7) {
			System.out.println(number++);
//		OR	System.out.println(number);
//			++number

// 		OR NOT USING LOOP >> 1
			System.out.println("---------------------");
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
			System.out.println("4");
			System.out.println("5");
			System.out.println("6");

// 		OR using ++
			System.out.println("---------------------");
			System.out.println(number++);
			System.out.println(number++);
			System.out.println(number++);
			System.out.println(number++);
			System.out.println(number++);
			System.out.println(number++);
			System.out.println(number++);

//	 		USING LOOP
			System.out.println("---------------------");
			boolean passed = false;
			int grade = 55;
			while (!passed) { // or pass !=true
				System.out.println("System: Sorry, you didn't pass; try harder than:" +grade);
				
				System.out.println("Student: Ok I will study harder");
				++grade;
				if (grade >=60) {
					passed = true;
					System.out.println("Finally, a passing grade");
				}
			}
			
		}

	}

}
