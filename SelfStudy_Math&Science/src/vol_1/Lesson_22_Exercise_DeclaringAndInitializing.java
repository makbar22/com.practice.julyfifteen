package vol_1;

public class Lesson_22_Exercise_DeclaringAndInitializing {

	public static void main(String[] args) {

		int length = 10;
		int width = 12, height = 15;
		int volume = length * width * height; //the int volume is dynamically initialized

		System.out.println("The volume is initialized to a value of: " + volume);
	}
}
