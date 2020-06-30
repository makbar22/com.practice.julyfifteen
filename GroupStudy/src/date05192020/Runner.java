package date05192020;

public class Runner {

	public static void main(String[] args) {

		MobilePhone iphone = new MobilePhone();
		iphone.setModel("iPhone 11 Pro");
		System.out.println(iphone.getModel());

		iphone.setColor("Black");
		System.out.println(iphone.getColor());

		iphone.setReleaseYear(2019);
		System.out.println(iphone.getReleaseYear());

		iphone.setScreenSize(10);
		System.out.println(iphone.getScreenSize());

		iphone.turnOn();
		iphone.turnOff();
	}

}
