package date05192020;

public class MobilePhone {

	private String model, color; // declare variables
	private int releaseYear, screenSize;

	public MobilePhone() { // default cons.

	}

	public MobilePhone(String model, String color, int releaseYear, int screenSize) { // parameterized cons.
		this.model = model;
		this.color = color;
		this.releaseYear = releaseYear;
		this.screenSize = screenSize;

	}

	public void turnOn() { // general method (void because we don't want it to return data type)
		System.out.println("Your mobile phone has turned on!!");

	}

	public void turnOff() {
		System.out.println("Your mobile phone has turned off!!");

	}

	public void setModel(String model) {
		this.model = model;

	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;

	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;

	}

	public String getModel() {
		return model;

	}

	public String getColor() {
		return color;

	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public int getScreenSize() {
		return screenSize;
	}

}
