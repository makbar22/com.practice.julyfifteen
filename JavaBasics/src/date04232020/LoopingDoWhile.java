package date04232020;

public class LoopingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20;
		while (age > 20 && age < 150) {
			age++;
			System.out.println("using while: you can drive");
		}

		do {
			age++;
			System.out.println("using do while: you can drive" + age);
		} while (age > 20 && age < 150);

	}

}
