package inheritance06172020;

public class Main {

	public static void main(String[] args) {

		Mouse1 m1 = new Mouse1();

		m1.rightClick();
		m1.lefClick();
		m1.scrollUp();
		m1.scrollDown();

		Mouse2 m2 = new Mouse2();
		m2.rightClick();
		m2.lefClick();
		m2.scrollUp();
		m2.connect();

	}

}
